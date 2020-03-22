package by.moiseenko.utils;

import by.moiseenko.entity.Worker;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkerServiceTest {

  private static final Logger LOG = LogManager.getLogger(WorkerServiceTest.class.getName());
  private static List<Worker> testData;
  private WorkerService workerService = new WorkerService();

  @BeforeAll
  static void init() {

    JacksonDeserializer deserializer = new JacksonDeserializer();
    try {
      testData = deserializer.getDataFromJSON("src/main/resources/MOCK_DATA.json", Worker[].class);
    } catch (JsonProcessingException e) {
      LOG.error(e);
    }
  }

  @Test
  void qtyLongNames() {
    Assertions.assertEquals(835, workerService.qtyLongNames(testData, 5));
  }

  @Test
  void qtyLongNamesByStream() {
    Assertions.assertEquals(835, workerService.qtyLongNamesByStream(testData, 5));
  }


  @Test
  void printAllNames() {
    workerService.printAllNames(testData);
  }


  @Test
  void printAllNamesSorted() {
    workerService.printAllNamesSorted(testData);
  }

  @Test
  void getTheRichestWorker() {
    Assertions.assertEquals(testData.get(355), workerService.getTheRichestWorker(testData));
  }
}