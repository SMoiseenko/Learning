package by.moiseenko;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class WorkWithFile {
    private static final Logger logger = Logger.getLogger(WorkWithFile.class);
    private String filePath;


    public WorkWithFile(String filePath) {
        this.filePath = filePath;
    }

    public void doAction() {
        try {
            File file = new File(filePath);
            if (file.exists() && !file.isDirectory()) {
                logger.debug("File Absolute Path:" + file.getAbsolutePath());
                logger.debug("File Path: " + file.getPath());
                logger.debug("File Size (byte): " + file.length());
                DateFormat dfLocale = DateFormat.getDateInstance(DateFormat.FULL);
                logger.debug("File Last modification RUS: " + dfLocale.format(new Date(file.lastModified())));
                logger.debug("File Last modification ENG: " + new Date(file.lastModified()));
                logger.debug("File Is access for read: " + file.canRead());
                logger.debug("File Is access for write: " + file.canWrite());
                logger.debug("File Is access for execute: " + file.canExecute());
                logger.debug("File deleted: " + file.delete());
                logger.debug("File created: " + file.createNewFile());


            } else if (file.exists() && file.isDirectory()) {
                logger.debug("Directory \"" + file.getName() + "\" exist.");
                logger.debug("Dir Absolute Path:" + file.getAbsolutePath());
                logger.debug("Dir Path: " + file.getPath());
                File[] allFiles = file.listFiles();
                if (allFiles.length != 0) {
                    for (File f : allFiles) {
                        Date date = new Date(f.lastModified());
                        System.out.println(f.getAbsolutePath() + "|" + f.length() + "|" + date);
//                       if (f.isFile()){
//                           Files.copy(f.toPath(), Paths.get("testfolder/innerfolder").resolve(f.getName()), REPLACE_EXISTING);
//                       }
                    }
                } else {
                    System.out.println("Folder " + file.getName() + " is empty.");
                }

                List fileList = Files.walk(Paths.get("/home/s-moiseenko/IdeaProjects"))
                        .filter(Files::isRegularFile)
                        .collect(Collectors.toList());


                String txtOutputFileName = "testfolder/filesList.txt";
                File txtOutputFile = new File(txtOutputFileName);
                if(txtOutputFile.exists()){
                    txtOutputFile.delete();
                    txtOutputFile.createNewFile();
                }

                fileList.stream().forEach(c -> {
                    try (FileWriter fWriter = new FileWriter(txtOutputFileName, true)) {
                        fWriter.write(c.toString()+ "\n");
                        fWriter.flush();
                    } catch (IOException ex) {
                        logger.debug(ex);
                    }
                });


            } else {
                logger.debug("File or directory \"" + file.getName() + "\" not exist!!!");
            }
        } catch (IOException ex) {
            logger.debug(ex);
        }

    }

}
