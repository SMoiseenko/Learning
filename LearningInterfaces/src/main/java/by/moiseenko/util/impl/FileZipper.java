package by.moiseenko.util.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileZipper {
  private static final Logger logger = LogManager.getLogger(FileZipper.class);

  public void singleFileZipper(String file2Zip, String outputZipFile) throws IOException {
    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outputZipFile));
    FileInputStream fis = new FileInputStream(file2Zip);
    zos.putNextEntry(new ZipEntry(file2Zip));
    byte[] buffer = new byte[fis.available()];
    fis.read(buffer);
    zos.write(buffer);
    zos.closeEntry();
    zos.close();
  }

  public boolean zipDir(String srcDir, String outputFile) {

    try {
      Path srcPath = Paths.get(srcDir).toRealPath();
      FileZipperVisitor fzv = new FileZipperVisitor(srcDir, outputFile);
      Files.walkFileTree(srcPath, fzv);
      fzv.getZos().close();
      return true;
    } catch (IOException ioe) {
      logger.error(ioe);
      return false;
    }
  }

  private class FileZipperVisitor extends SimpleFileVisitor<Path> {
    private String srcDir;
    private String outputFile;
    private final int BUFFER = 2048;
    private ZipOutputStream zos;

    public ZipOutputStream getZos() {
      return zos;
    }

    FileZipperVisitor(String srcDir, String outputFile) {
      this.srcDir = srcDir;
      this.outputFile = outputFile;
      try {
        zos = new ZipOutputStream(new FileOutputStream(outputFile));
        zos.setLevel(Deflater.DEFAULT_STRATEGY);
      } catch (FileNotFoundException fnf) {
        logger.error(fnf);
      }
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
        throws IOException {

      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      String relativePath = Paths.get(System.getProperty("user.dir")).relativize(file).toString();
      zos.putNextEntry(new ZipEntry(relativePath));

      InputStream is = Files.newInputStream(file, StandardOpenOption.READ);
      int len;
      byte[] readBytes = new byte[is.available()];
      is.read(readBytes);
      zos.write(readBytes);
      zos.closeEntry();
      return FileVisitResult.CONTINUE;
    }
  }
}
