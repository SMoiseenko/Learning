package by.moiseenko.util;

import by.moiseenko.entity.Man;
import by.moiseenko.exception.YouForgetAnnotationException;

public interface ManCreator {
  Man createMan(String name, int age) throws YouForgetAnnotationException;
}
