package by.moiseenko.inputs;

import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class FileReader {
    private static final Logger logger = Logger.getLogger(FileReader.class);

    public int[] readFileInByteArray(String filePath) {
        try (InputStream os = new BufferedInputStream(new FileInputStream(filePath), 1024)) {

            byte[] tempByteArray = os.readAllBytes();
            int[] resultIntArray = byteArrayToInt(tempByteArray);
            return resultIntArray;


    } catch(
    IOException ex)

    {
        logger.debug(ex);
        return new int[0];
    }

}

    private int[] byteArrayToInt(@NotNull byte[] byteArray) {
        int[] intArray = new int[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] < 0) {
                intArray[i] = 0x100 + byteArray[i];
            } else {
                intArray[i] = byteArray[i];
            }
        }
        return intArray;
    }
}

