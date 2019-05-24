package by.moiseenko.entity;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Warehouse implements Iterable<Goods> {
  private static final Logger LOG = LogManager.getLogger(Warehouse.class.getName());
  private static final int WAREHOUSE_CAPACITY = 20;
  private Queue<Goods> goods = null;

  public Warehouse() {
    this.goods = new LinkedBlockingQueue<>(WAREHOUSE_CAPACITY);
  }

  public Warehouse(int capacity){
    this.goods = new LinkedBlockingQueue<>(capacity);
  }

  public static Warehouse createWarehouse(int capacity){
    return new Warehouse(capacity);
  }

  public static Warehouse createWarehouse(int capacity, List<Goods> goods){
    Warehouse warehouse = Warehouse.createWarehouse(capacity);
    warehouse.goods.addAll(goods);
    return warehouse;
  }

  public Goods getGoods() {
    return goods.poll();
  }

  public boolean addGoods(Goods goods) {
    return this.goods.add(goods);
  }

  @NotNull
  @Override
  public Iterator<Goods> iterator() {
    return goods.iterator();
  }
}
