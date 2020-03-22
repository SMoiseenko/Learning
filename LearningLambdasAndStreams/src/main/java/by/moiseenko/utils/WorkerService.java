package by.moiseenko.utils;

import by.moiseenko.entity.Worker;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class WorkerService {

  private static final Logger LOG = LogManager.getLogger(WorkerService.class.getName());

  public long qtyLongNames(List<? extends Worker> workers, int nameLength) {
    long result = 0;
    for (Worker w : workers) {
      if (w.getFirstName().length() >= nameLength) {
        result++;
      }
    }
    return result;
  }

  public long qtyLongNamesByStream(List<? extends Worker> workers, int nameLength) {
    return workers.stream().filter(w -> w.getFirstName().length() >= nameLength).count();
  }

  public void printAllNames(List<? extends Worker> workers){
    makeNamesStream(workers).forEach(LOG::debug);
  }

  public void printAllNamesSorted(List<? extends Worker> workers){
    makeNamesStream(workers).sorted((String::compareToIgnoreCase)).forEach(LOG::debug);
  }

  private Stream<String> makeNamesStream(List<? extends Worker>workers){
    return workers.stream().map(w->w.getLastName().concat(" ").concat(w.getFirstName())).limit(10);
  }

  public Worker getTheRichestWorker(List<Worker> workers){
    return workers.stream().max(Comparator.comparing(Worker::getSalary)).orElse(new Worker());
  }


}
