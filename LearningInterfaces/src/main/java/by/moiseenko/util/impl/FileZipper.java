package by.moiseenko.util.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Enumeration;
import java.util.zip.*;

public class FileZipper {
  private static final Logger logger = LogManager.getLogger(FileZipper.class);
  private static final int BUFFER = 1024;

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
            byte[] readBytes = new byte[BUFFER];
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
            zos.putNextEntry(zEntry);
            zos.closeEntry();
            return FileVisitResult.CONTINUE;
          }
        });
    zos.close();
    logger.debug("Zipping Completed successfully.");
  }

  public static void unzip(String file2Unzip, String dir2Unzip) throws IOException {
    ZipFile zipFile = new ZipFile(file2Unzip);
    File dir2UnzipFile = new File(dir2Unzip);
    if (!dir2UnzipFile.exists()) {
      dir2UnzipFile.mkdir();
    }
    FileWriter fWriter = new FileWriter(dir2Unzip + "/unzip_result.txt");
    Enumeration<? extends ZipEntry> zipEntryEnumeration = zipFile.entries();
    while (zipEntryEnumeration.hasMoreElements()) {
      ZipEntry zEntry = zipEntryEnumeration.nextElement();
      String zEntryName = zEntry.getName();
      File destFile = new File(dir2UnzipFile, zEntryName);
      File destParent = destFile.getParentFile();
      destParent.mkdirs();
      if (!zEntry.isDirectory()) {
        BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(zEntry));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile), BUFFER);
        int curByte;
        byte[] curData = new byte[BUFFER];
        while ((curByte = bis.read(curData, 0, BUFFER)) > 0) {
          bos.write(curData, 0, curByte);
        }
        bos.flush();
        bos.close();
        bis.close();

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
    }
    fWriter.flush();
    fWriter.close();
  }
}
