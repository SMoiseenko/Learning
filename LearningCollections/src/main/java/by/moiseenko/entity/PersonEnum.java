package by.moiseenko.entity;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public enum PersonEnum {
  NAME_ALPHABET(true),
  NAME_LENGTH(true),
  AGE(true);

  private boolean ascend;

  private PersonEnum(boolean ascend) {
    this.ascend = ascend;
  }

  public boolean isAscend() {
    return ascend;
  }

  public void setAscend(boolean ascend) {
    this.ascend = ascend;
  }
}
