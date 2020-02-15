package by.moiseenko;

import by.moiseenko.structural.flyweight.Tree;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestFlyWeight {

  private static final Logger LOG = LogManager.getLogger(TestFlyWeight.class.getName());

  @Test
  void testFlyWeight(){
    int qtyThrees = 60;
    Random rnd = new Random();
    List<Tree> treeList = new ArrayList<>(qtyThrees);
    int i = 0;
    for (; i<20; i++){
      treeList.add(new Tree(rnd.nextInt(100), rnd.nextInt(200), "ELM", "ELM_COLOR", "ELM_TEXTURE"));
    }
    for (; i<40; i++){
      treeList.add(new Tree(rnd.nextInt(100), rnd.nextInt(200), "BIRCH", "BIRCH_COLOR", "BIRCH_TEXTURE"));
    }
    for (; i<60; i++){
      treeList.add(new Tree(rnd.nextInt(100), rnd.nextInt(200), "OAK", "OAK_COLOR", "OAK_TEXTURE"));
    }
    treeList.forEach(Tree::placeTree);
    assertEquals(1,1);
  }


}
