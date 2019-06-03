package by.moiseenko;

import static org.testng.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RunnerTest {

  @DataProvider
  private Object[][] dataForSumWithPredicate(){
    return new Object[][]{{Arrays.asList(10,11,20,25,40), (Predicate<Integer>)i->i>20, 65},{Arrays.asList(1,4,9,-100), (Predicate<Integer>)i->true, -86}};
  }


  @Test(dataProvider = "dataForSumWithPredicate")
  public void testSumWithPredicate(List<Integer> intList, Predicate<Integer> predicate, int expected){
  int actual = Runner.sumWithPredicate(intList,predicate);
    Assert.assertEquals(actual, expected);
  }

}