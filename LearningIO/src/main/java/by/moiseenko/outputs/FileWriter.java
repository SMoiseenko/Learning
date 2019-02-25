package by.moiseenko.outputs;

import org.apache.log4j.Logger;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriter {
    private static final Logger logger = Logger.getLogger(FileWriter.class);

    public void writeInFileByteArray(String filePath, int[] dataIntArray) {
        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(filePath), 1024)) {

            for (int i = 0; i < dataIntArray.length; i++) {
                os.write(dataIntArray[i]);
            }
        } catch (IOException ex) {
            logger.debug(ex);
        }

    }
}
