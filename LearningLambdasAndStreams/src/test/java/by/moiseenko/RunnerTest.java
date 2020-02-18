package by.moiseenko;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunnerTest {

  @Test
  public void testSumWithPredicateOne(){
  int actual = Runner.sumWithPredicate(Arrays.asList(10,11,20,25,40),i->i>20);
    Assertions.assertEquals(actual, 65);
  }

  @Test
  public void testSumWithPredicateTwo(){
    int actual = Runner.sumWithPredicate(Arrays.asList(1,4,9,-100),i->true);
    Assertions.assertEquals(actual, -86);
  }

}