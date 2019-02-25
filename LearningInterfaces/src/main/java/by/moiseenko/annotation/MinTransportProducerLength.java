package by.moiseenko.annotation;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.CONSTRUCTOR)
public @interface MinTransportProducerLength {
  int min() default 7;
}
