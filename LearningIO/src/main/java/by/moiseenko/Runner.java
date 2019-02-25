package by.moiseenko;

import by.moiseenko.inputs.FileReader;
import by.moiseenko.outputs.FileWriter;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Runner {
    private static final Logger logger = Logger.getLogger(Runner.class);

    public static void main(String[] args) {

        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "log4j (копия).properties";
        String dirPath = "testfolder";
        WorkWithFile wwf = new WorkWithFile(filePath);
        WorkWithFile wwd = new WorkWithFile(dirPath);
        wwf.doAction();
        wwd.doAction();
















//
//        for (int rt = 0; rt < makeNTime; rt++) {
//
//            int[] resArray = fr.readFileInByteArray(filePath);
//            inArray = resArray;
//            for (int i : resArray) {
//                System.out.printf("0x%02X, ", i);
//            }
//            System.out.printf("%n");
//
//            outArray = new int[inArray.length + 1];
//            for (int i = 0; i < inArray.length; i++) {
//                outArray[i] = inArray[i];
//            }
//
//            outArray[outArray.length - 1] = outArray[outArray.length - 2] + 1;
//            for (int i : outArray) {
//                System.out.printf("0x%02X, ", i);
//            }
//            System.out.printf("%n");
//            fw.writeInFileByteArray(filePath, outArray);
//
//        }

    }
}
