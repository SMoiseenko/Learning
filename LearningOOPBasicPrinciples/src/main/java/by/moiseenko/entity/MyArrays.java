package by.moiseenko.entity;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class MyArrays {

  private static final Logger LOG = LogManager.getLogger(MyArrays.class.getName());
  private final String instanceName;

    public MyArrays(String instanceName) {
    this.instanceName = instanceName;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public void doAction() {
    int[] arInt = new int[0];
    LOG.debug(arInt.length);
    arInt = new int[] {1, 3, 5, 7, 10};
    float[] arFloat = {2.1f, 2.2f, 2.3f, 2.4f};
    for (int i : arInt) {
      LOG.debug(i);
    }
    for (float f : arFloat) {
      LOG.debug(f);
    }

    for (int i = 0; i < arFloat.length / 2; i++) {
      float i1 = arFloat[i];
      arFloat[i] = arFloat[arFloat.length - 1 - i];
      arFloat[arFloat.length - 1 - i] = i1;
    }
    for (float f : arFloat) {
      LOG.debug(f);
    }

    Car[] carArray = new Car[] {new Car(), new Car(), new Car(), new Car(), new Car()};
    LOG.debug(carArray.length);
    Object obj = carArray;
    Car[] anCarArray = (Car[]) obj;
    obj = List.of(13f, 17f, 21f);
    List<Float> floatList = (List<Float>) obj;
    floatList.stream().forEach(LOG::debug);

    int[] toSort = {10, -3, 7, -4, -1, 0, 8, -2, -5, 6, 9};
    LOG.debug("Sorted by MIN");
    sortArray(toSort, IntSorted.MIN);
    LOG.debug("Sorted by MAX");
    abs(toSort);
    sortArray(toSort, IntSorted.MAX);
    LOG.debug("==========");
   ;

  }

  private void sortArray(int[] array, IntSorted sorted) {

    int min;
    int[] tArray;

    while (array.length > 0) {
      min = array[0];
      int tAI = 0;
      tArray = new int[array.length - 1];
      for (int j = 1; j <= array.length - 1; j++) {
        switch (sorted) {
          case MIN:
            if (array[j] < min) {
              tArray[tAI++] = min;
              min = array[j];
            } else {
              tArray[tAI++] = array[j];
            }
            break;
          case MAX:
            if (array[j] > min) {
              tArray[tAI++] = min;
              min = array[j];
            } else {
              tArray[tAI++] = array[j];
            }
            break;
        }
      }
      LOG.debug(min);
      array = tArray;
    }
  }

  private void abs(int[] array){
    for(int i = 0; i<=array.length -1; i++){
      array[i] = Math.abs(array[i]);
    }
  }
}
