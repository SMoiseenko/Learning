package by.moiseenko.util.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Enumeration;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class FileZipper {
  private static final Logger logger = LogManager.getLogger(FileZipper.class);

  public static void zipDir(String srcDir) throws IOException {
    logger.debug(String.format("Start zipping \"%s\" folder.", srcDir));
    Path srcPath = Paths.get(srcDir).toRealPath();
    String outPutFile = srcDir.concat(".zip");
    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outPutFile));

    Files.walkFileTree(
        srcPath,
        new SimpleFileVisitor<>() {
          @Override
          public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
              throws IOException {
            String relativePath =
                Paths.get(System.getProperty("user.dir")).relativize(file).toString();
            ZipEntry zEntry = new ZipEntry(relativePath);
            zEntry.setMethod(Deflater.DEFLATED);
            zos.putNextEntry(zEntry);
            InputStream is = Files.newInputStream(file, StandardOpenOption.READ);
            int len;
            byte[] readBytes = new byte[1024];
            while ((len = is.read(readBytes)) > 0) {
              zos.write(readBytes, 0, len);
            }
            is.close();
            zos.closeEntry();

            return FileVisitResult.CONTINUE;
          }

          @Override
          public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
              throws IOException {
            String relativePath =
                Paths.get(System.getProperty("user.dir")).relativize(dir).toString() + "/";
            ZipEntry zEntry = new ZipEntry(relativePath);
           // zEntry.setMethod(Deflater.NO_COMPRESSION);
            zos.putNextEntry(zEntry);
            zos.closeEntry();
            return FileVisitResult.CONTINUE;
          }
        });
    zos.close();
    logger.debug("Zipping Completed successfully.");
  }

  public static void unzip(String file) throws IOException {
    ZipFile zipFile = new ZipFile(file);
    FileWriter fWriter = new FileWriter(file + ".txt");
    Enumeration<? extends ZipEntry> zipEntryEnumeration = zipFile.entries();
    while (zipEntryEnumeration.hasMoreElements()) {
      ZipEntry zEntry = zipEntryEnumeration.nextElement();
      fWriter.write(
          zEntry.getName()
              + "|"
              + zEntry.getSize()
              + "|"
              + zEntry.getCompressedSize()
              + "|"
              + zEntry.getMethod()
              + "|"
              + Integer.toHexString((int) zEntry.getCrc())
              + "\n");
    }
    fWriter.flush();
    fWriter.close();
  }
}
