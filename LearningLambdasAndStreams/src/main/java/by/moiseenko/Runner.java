package by.moiseenko;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());
  private static final String htmlFile =
      "/home/moiseenko-s/Downloads/temp/book/03.Java Collections Framework.html";
  private static final String fileAppender = "_new";

  public static void main(String[] args) {

    File[] fileArray = getHtmlArray();
    StringBuilder sb;
    for (File file : fileArray) {
      sb = scanFile(file);
      writeToFile(sb, file);
    }
  }

  private static StringBuilder scanFile(File file) {
    StringBuilder sb = new StringBuilder();
    boolean impotentLine = true;
    int paragraph = Integer.valueOf(file.getName().substring(0, 2));
    String line;

    sb.append("<!DOCTYPE html>\n")
        .append("<html>\n")
        .append("<head>\n")
        .append("<meta charset=\"UTF-8\">\n")
        .append("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>\n");

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        line = scanner.nextLine();

        if (line.matches("([\\s\\t]*)(<Task>)([\\s\\t]*)")) {
          continue;
        }

        if (line.matches("([\\s\\t]*)(</Task>)([\\s\\t]*)")) {
          continue;
        }

        if (line.matches("([\\s\\t]*)(</Article>)([\\s\\t]*)")) {
          continue;
        }

        if (line.matches("([\\s\\t]*)")) {
          continue;
        }

        if (line.matches("([\\s\\t]*)(<Genre>).*(</Genre>)([\\s\\t]*)")) {
          if (impotentLine) {
            String temp =
                paragraph + ". " + line.substring(line.indexOf('>') + 1, line.lastIndexOf('<'));
            line =
                "<title>"
                    + temp
                    + "</title>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "<h1>"
                    + temp
                    + "</h1>";
            impotentLine = false;
          } else continue;
        }

        if (line.matches("([\\s\\t]*)(<Article>).*")) {
          line = line.substring(line.indexOf('>') + 1);
        }

        if (line.matches("([\\s\\t]*)(img width=100%).*")) {
          line =
              "<img src=\"pictures/"
                  + line.substring(line.lastIndexOf('/') + 1, line.lastIndexOf('>'))
                  + "\">";
        }

        if (line.matches("([\\s\\t]*)(<Title>).*(</Title>)([\\s\\t]*)")) {
          line =
              "<h2>"
                  + paragraph
                  + '.'
                  + line.substring(line.indexOf('>') + 1, line.lastIndexOf('<'))
                  + "</h2>";
        }

        //        if (line.startsWith("<h2>") && line.endsWith("</p>")) {
        //          line = line.replace("</p>", "</h2>");
        //        }

        line = line.trim();

        if (!line.startsWith("<h1>") && !line.startsWith("<h2>") && !line.startsWith("<title>")) {
          line = "<p>" + line + "</p>";
        }
        sb.append(line);
        if (scanner.hasNextLine()) {
          sb.append("\n");
        }
      }
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
    return sb.append("</body>").append("</html>");
  }

  private static void writeToFile(StringBuilder text, File file) {
    String fileName =
        file.getAbsolutePath()
            .substring(0, file.getAbsolutePath().lastIndexOf('.'))
            .concat(fileAppender)
            .concat(file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf('.')));

    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
      bufferedWriter.write(text.toString());
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
  }

  private static File[] getHtmlArray() {
    File pathToDir = new File(htmlFile.substring(0, htmlFile.lastIndexOf('/')));
    File[] htmlArray =
        pathToDir.listFiles(
            pathname ->
                pathname.getName().endsWith(".html") && !pathname.getName().endsWith("_new.html"));
    Arrays.sort(htmlArray, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    return htmlArray;
  }
}
