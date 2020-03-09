package by.moiseenko.utils.impl;

import by.moiseenko.entity.Car;
import by.moiseenko.entity.House;
import by.moiseenko.entity.HouseRepoType;
import by.moiseenko.entity.MazdaCar;
import by.moiseenko.entity.ParamClass;
import by.moiseenko.utils.HouseUtils;
import com.sun.jdi.IntegerType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HouseUtilsImplTest {

  private static final Logger LOG = LogManager.getLogger(HouseUtilsImplTest.class.getName());

  private static HouseUtils houseUtils;

  @BeforeAll
  private static void initData() {
    houseUtils = new HouseUtilsImpl(HouseRepoType.JSON, "src/test/resources/house_db.json");
  }


  @Test
  public void testHouseArrayWithRoomsQty() {
    House[] expectedResult = new HouseRepositoryJSONImpl(
        "src/test/resources/expected_result_for_testHouseArrayWithRoomsQty.json").loadFromRepo();
    House[] actualResult = houseUtils.houseArrayWithRoomsQty(3);
    Assertions.assertArrayEquals(actualResult, expectedResult);


  }

  @Test
  public void testHouseArrayWithRoomsQtyOnFloorsInterval() {
    House[] expectedResult = new HouseRepositoryJSONImpl(
        "src/test/resources/expected_result_for_testHouseArrayWithRoomsQtyOnFloorsInterval.json")
        .loadFromRepo();
    House[] actualResult = houseUtils.houseArrayWithRoomsQtyOnFloorsInterval(3, 50, 100);
    Assertions.assertArrayEquals(actualResult, expectedResult);
  }

  @Test
  public void testHouseArrayWithFlatSquareMoreThan() {
    House[] expectedResult = new HouseRepositoryJSONImpl(
        "src/test/resources/expected_result_for_testHouseArrayWithFlatSquareMoreThan.json")
        .loadFromRepo();
    House[] actualResult = houseUtils.houseArrayWithFlatSquareMoreThan(300.00);
    Assertions.assertArrayEquals(actualResult, expectedResult);
  }

  @Test
  void testArray() {
    Car[] carsArray = new MazdaCar[1];
    Assertions.assertThrows(ArrayStoreException.class, () -> carsArray[0] = new Car());
  }

  @Test
  void testWildcards() {
    List<MazdaCar> mazdaCarList = new ArrayList<>();
    MazdaCar mazdaCar = new MazdaCar();
    mazdaCar.doorsQty = 10;
    mazdaCarList.add(new MazdaCar());
    mazdaCarList.add(mazdaCar);
    mazdaCarList.removeIf(c -> c.doorsQty == 5);
    mazdaCarList.replaceAll(c->new MazdaCar());
    mazdaCarList.forEach(LOG::debug);
    ParamClass.findByPredicate((ArrayList<? extends MazdaCar>) mazdaCarList, (car)->car.doorsQty==5);
  }

  @Test
  void testCharSec(){
    String[] strArray = {"Hello", "Seldom", "Night"};

    Predicate<CharSequence> predicate = (o)->'S'==o.charAt(0);

    Assertions.assertEquals(
        'S', ParamClass.findChar(Arrays.asList(strArray), predicate));
  }
}

