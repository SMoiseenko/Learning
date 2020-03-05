package by.moiseenko;

import by.moiseenko.entity.Color;
import by.moiseenko.entity.Man;
import by.moiseenko.entity.Mannable;
import by.moiseenko.entity.Passport;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestReflection {

  private static final Logger LOG = LogManager.getLogger(TestReflection.class.getName());

  @Test
  void testReflection() throws Throwable {
    Class<?> cPass = Passport.class;
    Class<?> cMan = Man.class;

    Passport passport = (Passport) cPass.getDeclaredConstructor(long.class).newInstance(58L);
    LOG.debug(passport.toString());
    Field num = cPass.getDeclaredField("number");
    num.setAccessible(true);
    num.setLong(passport, 666L);
    LOG.debug(passport);
    Method setNumber = cPass.getDeclaredMethod("setNumber", long.class);
    setNumber.invoke(passport, 123456L);
    LOG.debug(passport);

    Man man =
        (Man)
            cMan.getDeclaredConstructor(int.class, String.class, int.class, Passport.class)
                .newInstance(20, "Siarhei", 18, passport);
    LOG.debug(man);

    BeanInfo info = Introspector.getBeanInfo(cMan);
    PropertyDescriptor[] props = info.getPropertyDescriptors();
    for (PropertyDescriptor prop : props) {
      if (prop.getName().equals("name")) LOG.debug(prop.getReadMethod().invoke(man));
    }

    Color red = Color.getRed();
    LOG.debug(red);

    Mannable manProxy =
        (Mannable)
            Proxy.newProxyInstance(
                man.getClass().getClassLoader(),
                man.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
                  LOG.debug("Was invoked method " + method.getName() + Arrays.toString(args));
                  return method.invoke(man, args);
                });

    manProxy.setId(1);
    manProxy.setName("PROXY_MAN");
    manProxy.setAge(33);
    manProxy.setPassport(new Passport(555666L));
    manProxy.toString();
  }
}
