package by.moiseenko.annotation;

import by.moiseenko.entity.SecurityLevelEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BankingAnnotation {
  SecurityLevelEnum securityLevel() default SecurityLevelEnum.NORMAL;
}
