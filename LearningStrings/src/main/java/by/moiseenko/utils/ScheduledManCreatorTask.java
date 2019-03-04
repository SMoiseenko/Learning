package by.moiseenko.utils;

import by.moiseenko.entity.Man;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.TimerTask;

public class ScheduledManCreatorTask extends TimerTask {
    private static final Logger logger = LogManager.getLogger(ScheduledManCreatorTask.class);
    @Override
    public void run() {
        Man man = null;
        String jsonName = "man.json";
        File jsonFile = new File(jsonName);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        logger.debug(Thread.currentThread().getId());

        if (!jsonFile.exists()) {
            logger.debug("man instance not exist, must be created\n");
            man = new ManCreator().create();
            try {
                om.writeValue(jsonFile, man);
            } catch (IOException ioe) {
                logger.error(ioe);
            }
        } else {
            try {
                logger.debug("man instance EXIST, will be readed from file\n");
                man = om.readValue(jsonFile, Man.class);
                System.out.println(man);
            } catch (IOException ioe) {
                logger.error(ioe);
            }
        }
    }
}
