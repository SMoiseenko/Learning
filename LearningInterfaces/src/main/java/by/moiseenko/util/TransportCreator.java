package by.moiseenko.util;

import by.moiseenko.entity.Transport;

public interface TransportCreator {

  Transport create(String producer, String model);

  Transport create(String producer, String model, int doorsQty);
}
