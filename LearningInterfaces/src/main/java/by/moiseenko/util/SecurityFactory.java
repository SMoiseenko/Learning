package by.moiseenko.util;

import by.moiseenko.annotation.BankingAnnotation;
import by.moiseenko.util.impl.SecurityLogic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityFactory {
  public static AccountOperationManager createSecurityObject(AccountOperationManager targetObject) {
    ClassLoader classLoader = targetObject.getClass().getClassLoader();
    Class<?>[] interfacesClass = targetObject.getClass().getInterfaces();
    InvocationHandler myInvocationHandler = new SecurityInvokeHandler(targetObject);
    return (AccountOperationManager)
        Proxy.newProxyInstance(classLoader, interfacesClass, myInvocationHandler);
  }

  private static class SecurityInvokeHandler implements InvocationHandler {
    private Object targetObject;

    public SecurityInvokeHandler(Object targetObject) {
      this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      SecurityLogic logic = new SecurityLogic();
      Method realMethod =
          targetObject
              .getClass()
              .getMethod(method.getName(), (Class[]) method.getGenericParameterTypes());
      BankingAnnotation annotation =
          (BankingAnnotation) realMethod.getAnnotation(BankingAnnotation.class);
      if (annotation != null) {
        logic.onInvoke(annotation.securityLevel(), realMethod, args);
        try {
          return method.invoke(targetObject, args);
        } catch (InvocationTargetException e) {
          System.out.println(annotation.securityLevel());
          throw e.getCause();
        }
      } else {
        // throw new InvocationTargetException(null, "method " + realMethod + " should be
        // annotated");
        return null;
      }
    }
  }
}
