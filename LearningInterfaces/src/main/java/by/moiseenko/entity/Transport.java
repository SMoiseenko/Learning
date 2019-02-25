package by.moiseenko.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Transport implements Serializable {
  private String producer;
  private String model;
  private String action = "STOP";
  private static final long serialVersionUID = 2L;

  public Transport(String producer, String model) {
    this.producer = producer;
    this.model = model;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public String toString() {
    return "Transport{"
        + "producer='"
        + producer
        + '\''
        + ", model='"
        + model
        + '\''
        + ", action='"
        + action
        + '\''
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Transport)) return false;

    Transport transport = (Transport) o;

    if (getProducer() != null
        ? !getProducer().equals(transport.getProducer())
        : transport.getProducer() != null) return false;
    if (getModel() != null
        ? !getModel().equals(transport.getModel())
        : transport.getModel() != null) return false;
    return getAction() != null
        ? getAction().equals(transport.getAction())
        : transport.getAction() == null;
  }

  @Override
  public int hashCode() {
    return Objects.hash(producer, model, action);
  }
}
