package by.moiseenko.entity;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public enum BuldingType {
  RETAIL(1),
  OFFICE(2),
  SPECIAL_PURPOSE(3);
  private long id;

  BuldingType(long id) {
    this.id = id;
  }

}
