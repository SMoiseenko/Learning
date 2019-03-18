package by.moiseenko.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlueRayDisk {

  private List<Files> storedFiles;
  private static final Logger LOG = LogManager.getLogger(BlueRayDisk.class.getName());
  private Map<Integer, List<Files>> storedFilesByDay;

  public BlueRayDisk(String... fileNames) {
    storedFiles = new ArrayList<>();
    for (String f : fileNames) {
      storedFiles.add(new Files(f));
    }
  }

  public void printAllFilesOnTheDisk() {
    if (storedFiles.size() == 0) {
      LOG.debug("DISK IS EMPTY");
    } else {
      for (Files f : storedFiles) {
        LOG.debug(f.fileName);
      }
    }
  }

  private class Files {

    private String fileName;

    private Files(String fileName) {
      this.fileName = fileName;
    }

  }
}
