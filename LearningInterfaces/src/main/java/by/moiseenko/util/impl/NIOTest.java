package by.moiseenko.util.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class NIOTest {
  private static final Logger logger = LogManager.getLogger(NIOTest.class);

  public void doAction() {
    try {
      String fileRelativePath = "./pom.xml";
      String homeDir = System.getProperty("user.home");
      String exDir = System.getProperty("user.dir");
      String fileAbsolutePath = homeDir + "/.bash_history";

      File fileRPIO = new File(fileRelativePath);
      File fileAPIO = new File(fileAbsolutePath);
      Path fileRPNIO = Paths.get(fileRelativePath);
      Path fileAPNIO = fileAPIO.toPath();

      System.out.println(fileRPNIO.getNameCount());
      System.out.println(fileAPNIO);
      System.out.println(fileAPNIO.getNameCount());

      for (Path path : fileAPNIO) {
        System.out.println(path);
      }

      System.out.println(fileRPIO.toURI());
      System.out.println(fileRPNIO.toUri());
      fileRPNIO = fileRPNIO.toRealPath(LinkOption.NOFOLLOW_LINKS);
      System.out.println(fileRPNIO.toUri());

      System.out.println(fileAPNIO.equals(fileAPIO.toPath()));
      System.out.println(fileRPNIO.compareTo(fileAPIO.toPath()));

      Path f1 = Paths.get("./pom.xml");
      Path f2 = Paths.get("./1.1");
      Path f3 = Paths.get("/home/moiseenko-s/IdeaProjects/Learning/LearningInterfaces/pom.xml");
      boolean result = false;

      result = Files.isSameFile(f1, f3);
      System.out.printf("Are %s and %s the same files: %b.%n", f1, f3, result);

      result = Files.isSameFile((f1 = f1.toRealPath()), (f2 = f2.toRealPath()));

      System.out.printf("Are %s and %s the same files: %b.%n", f1, f2, result);

      String f2Check = "1.1";
      Path p2Check = Paths.get(f2Check);
      result = Files.exists(p2Check);
      System.out.printf("Are file %s exist: %b.%n", f2Check, result);
      result = Files.exists(Paths.get("2.1"));
      System.out.printf("Are file 2.1 exist: %b.%n", result);
      result = Files.isDirectory(p2Check);
      System.out.printf("Are path %s exist: %b.%n", p2Check, result);

      System.out.printf("Are %s dir: %b.%n", homeDir, Files.isDirectory(Paths.get(homeDir)));

      Object ob1 = Files.getAttribute(p2Check, "creationTime");
      System.out.println(ob1);

      Path resPath = Files.copy(p2Check, Paths.get("./2.3"), StandardCopyOption.REPLACE_EXISTING);
      System.out.println(resPath);

      Files.deleteIfExists(resPath);

      Files.walk(Paths.get(homeDir), 1).sorted().forEach(System.out::println);

      System.out.println("*****************");
      Files.walkFileTree(
          Paths.get(System.getProperty("user.dir")),
          new FileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                throws IOException {
              System.out.println(dir.toRealPath());
              return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                throws IOException {
              System.out.println(file.toRealPath());

              return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
              System.out.printf("File %s is PROTECTED", file);
              return FileVisitResult.SKIP_SUBTREE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                throws IOException {
              // System.out.println("***THE HAPPY END***");
              return FileVisitResult.CONTINUE;
            }
          });

      MyFileUtils mfu = new MyFileUtils();
      boolean resCopy =
          mfu.makeCopy(exDir, homeDir + "/TEMP!", StandardCopyOption.REPLACE_EXISTING);
      logger.debug(resCopy);

      List<String> filesReadFromList =
          Files.readAllLines(Paths.get("./src/main/java/by/moiseenko/Runner.java"));
      for (String s : filesReadFromList) {
        System.out.println("\u001B[34m" + s + "\u001B[0m");
      }

      mfu.find(exDir, "regex:\\S+\\.java").stream()
          .sorted((p1, p2) -> p1.compareTo(p2))
          .forEach((s) -> System.out.println("\u001B[32m" + s + "\u001B[0m"));

      mfu.watchService(exDir);

    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
