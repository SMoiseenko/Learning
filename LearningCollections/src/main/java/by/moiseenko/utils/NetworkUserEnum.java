package by.moiseenko.utils;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public enum NetworkUserEnum {
  ID(true),
  FIRST_NAME(true),
  LAST_NAME(true),
  GENDER(true),
  AGE(true),
  DAY_OF_BIRTH(true),
  E_MAIL(true),
  IP_ADDRESS(true);

  private boolean ascend;

  NetworkUserEnum(boolean ascend) {
    this.ascend = ascend;
  }

  public void setAscend(boolean ascend) {
    this.ascend = ascend;
  }

  public boolean isAscend() {
    return ascend;
  }
}