package by.moiseenko.testAnnotation;

import org.testng.annotations.Test;

@Test
public class TestNGExtendedClass extends TestNGAnnotationTest{

    private void testWillNotRun(){
    System.out.println("This test will not run");
    }

    public void testWillRun(){
    System.out.println("This test will run");
    }

    @Test(enabled = false)
    public void testWillNotRunToo(){
    System.out.println("This test mark as @Test(enabled = false) and will not run");
    }

    @Override
    @Test(enabled = true)
    public void testEnableAnnotation() {
    System.out.println("Inherited @Test(enable = false) annotation on method and try to mark it TRUE");
    }
}
