package by.moiseenko.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@FunctionalInterface
interface Generic<T> {
  T summ(T a, T b);
}
