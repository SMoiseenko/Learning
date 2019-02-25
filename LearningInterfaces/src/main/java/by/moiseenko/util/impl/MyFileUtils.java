package by.moiseenko.util.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class MyFileUtils {

  private static final Logger logger = LogManager.getLogger(MyFileUtils.class);

  public boolean makeCopy(String src, String dest, CopyOption copyOption) {
    try {
      Path pFrom = new File(src).toPath();
      Path pTo = Paths.get(dest);
      System.out.println("Start copy files");
      Files.walkFileTree(pFrom, new MyFileCopy(pFrom, pTo, copyOption));
      System.out.println("Files was/where copied successfully");
      return true;
    } catch (IOException ex) {
      logger.error(ex);
      return false;
    }
  }

  public List<Path> find(String src, String pattern) {
    try {
      Path srcPath = Paths.get(src);
      MyFileSearch mfs = new MyFileSearch(srcPath, pattern);
      Files.walkFileTree(srcPath, mfs);
      return mfs.getSearchResultList();
    } catch (IOException ex) {
      logger.error(ex);
      return new ArrayList<>();
    }
  }

  public void watchService(String src) {
    try {
      Path srcPath = Paths.get(src);
      WatchService ws = FileSystems.getDefault().newWatchService();
      srcPath.register(
          ws,
          StandardWatchEventKinds.ENTRY_CREATE,
          StandardWatchEventKinds.ENTRY_DELETE,
          StandardWatchEventKinds.ENTRY_MODIFY);

      for (; ; ) {
        WatchKey wKey = ws.poll();
        if (wKey != null) {
          for (WatchEvent wEvent : wKey.pollEvents()) {
            switch (wEvent.kind().name()) {
              case "OVERFLOW":
                System.out.println("We lost some events");
                break;
              case "ENTRY_CREATE":
                System.out.println("File " + wEvent.context() + " is created!");
                break;
              case "ENTRY_MODIFY":
                System.out.println("File " + wEvent.context() + " is modified!");
                break;
              case "ENTRY_DELETE":
                System.out.println("File " + wEvent.context() + " is deleted!");
                break;
            }
          }
          wKey.reset();
        }
      }

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  //////////////////////////
  private class MyFileCopy extends SimpleFileVisitor<Path> {
    private final Path sourcePath;
    private final Path destinationPath;
    private final CopyOption copyOption;

    MyFileCopy(Path sourcePath, Path destinationPath, CopyOption copyOption) {
      this.sourcePath = sourcePath;
      this.destinationPath = destinationPath;
      this.copyOption = copyOption;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
        throws IOException {
      Path newDestinationPath = destinationPath.resolve(sourcePath.relativize(dir));
      if (!Files.exists(newDestinationPath)) Files.createDirectory(newDestinationPath);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      Path newDestinationPath = destinationPath.resolve(sourcePath.relativize(file));
      Files.copy(file, newDestinationPath, copyOption);
      return FileVisitResult.CONTINUE;
    }
  }

  /////////////////////////////
  private class MyFileSearch extends SimpleFileVisitor<Path> {
    private final Path searchPath;
    private PathMatcher pathMatcher;
    private List<Path> searchResultList = new ArrayList<>();

    public List<Path> getSearchResultList() {
      return searchResultList;
    }

    public MyFileSearch(Path searchPath, String pattern) {
      this.searchPath = searchPath;
      try {
        pathMatcher = FileSystems.getDefault().getPathMatcher(pattern);
      } catch (IllegalArgumentException ex) {
        logger.error(ex);
      }
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
        throws IOException {
      find(dir);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      find(file);
      return FileVisitResult.CONTINUE;
    }

    private void find(Path p) {
      Path name = p.getFileName();
      if (pathMatcher.matches(name)) {
        searchResultList.add(name);
        //                System.out.println("\u001B[32m" + name + "\u001B[0m");
      }
    }
  }
}
