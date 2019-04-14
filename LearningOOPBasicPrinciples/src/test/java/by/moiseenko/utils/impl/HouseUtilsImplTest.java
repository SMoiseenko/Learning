package by.moiseenko.utils.impl;

import by.moiseenko.entity.House;
import by.moiseenko.entity.HouseRepoType;
import by.moiseenko.utils.HouseUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HouseUtilsImplTest {

  private HouseUtils houseUtils;

  @BeforeClass
  private void initData() {
    houseUtils = new HouseUtilsImpl(HouseRepoType.JSON, "src/test/resources/house_db.json");
  }


  @Test
  public void testHouseArrayWithRoomsQty() {
    House[] expectedResult = new HouseRepositoryJSONImpl("src/test/resources/expected_result_for_testHouseArrayWithRoomsQty.json").loadFromRepo();
    House[] actualResult = houseUtils.houseArrayWithRoomsQty(3);
    Assert.assertEquals(actualResult, expectedResult);


  }

  @Test
  public void testHouseArrayWithRoomsQtyOnFloorsInterval() {
    House[] expectedResult = new HouseRepositoryJSONImpl("src/test/resources/expected_result_for_testHouseArrayWithRoomsQtyOnFloorsInterval.json").loadFromRepo();
    House[] actualResult = houseUtils.houseArrayWithRoomsQtyOnFloorsInterval(3,50,100);
    Assert.assertEquals(actualResult, expectedResult);
  }

  @Test
  public void testHouseArrayWithFlatSquareMoreThan() {
    House[] expectedResult = new HouseRepositoryJSONImpl("src/test/resources/expected_result_for_testHouseArrayWithFlatSquareMoreThan.json").loadFromRepo();
    House[] actualResult = houseUtils.houseArrayWithFlatSquareMoreThan(300.00);
    Assert.assertEquals(actualResult, expectedResult);
  }
}