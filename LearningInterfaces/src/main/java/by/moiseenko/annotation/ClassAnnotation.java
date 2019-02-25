package by.moiseenko.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ClassAnnotation {}
