package by.moiseenko.entity.modelentity;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class BookModel {
  private static final Logger LOG = LogManager.getLogger(BookModel.class.getName());

  private String name;
  private String yearOfPublish;
  private String price;
  private List<String> listAuthorsId;

  public BookModel() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getYearOfPublish() {
    return yearOfPublish;
  }

  public void setYearOfPublish(String yearOfPublish) {
    this.yearOfPublish = yearOfPublish;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public List<String> getListAuthorsId() {
    return listAuthorsId;
  }

  public void setListAuthorsId(List<String> listAuthorsId) {
    this.listAuthorsId = listAuthorsId;
  }

  @Override
  public String toString() {
    return "BookModel{"
        + "name='"
        + name
        + '\''
        + ", yearOfPublish='"
        + yearOfPublish
        + '\''
        + ", price='"
        + price
        + '\''
        + ", listAuthorsId="
        + listAuthorsId
        + '}';
  }
}
