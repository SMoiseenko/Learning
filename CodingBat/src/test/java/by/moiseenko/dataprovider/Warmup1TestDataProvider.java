package by.moiseenko.dataprovider;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

/**
 * Data provider for Warmup1Test
 */
public class Warmup1TestDataProvider {

  public static Object[][] sleepInDataProvider() {
    return new Object[][]{
        {false, false, true},
        {true, false, false},
        {false, true, true},
        {true, true, true},
    };
  }

  public static Stream<Arguments> sumDoubleDataProvider() {
    return Stream.of(
        Arguments.of(1, 2, 3),
        Arguments.of(3, 2, 5),
        Arguments.of(2, 2, 8),
        Arguments.of(-1, 0, -1),
        Arguments.of(3, 3, 12),
        Arguments.of(0, 0, 0),
        Arguments.of(0, 1, 1),
        Arguments.of(3, 4, 7)
    );
  }

}
