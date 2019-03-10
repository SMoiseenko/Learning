package by.moiseenko.testAnnotation;

import org.testng.annotations.Test;

public class TestNGAnnotationTest {
    @Test
    public void test(){
    System.out.println("@Test annotation on public method");
    }
    @Test
    private void testPrivateMethod(){
    System.out.println("@Test annotation on private method");
  }
  @Test(enabled = false)
    public void testEnableAnnotation(){
    System.out.println("@Test(enable = ????) annotation on method");
  }

      public void testWithoutAnnotation(){
    System.out.println("Test method without annotation");
      }
}
