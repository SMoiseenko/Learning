package by.moiseenko.model;

import java.util.Objects;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Entity {

  protected long id;

  public Entity() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Entity)) {
      return false;
    }
    Entity entity = (Entity) o;
    return getId() == entity.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }
}
