package by.moiseenko.testAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSuiteAnnotation {
    @BeforeSuite
    public void beforeSuite(){
    System.out.println("====BEFORE TEST ANNOTATION SUITE=====");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("====AFTER TEST ANNOTATION SUITE=====");
    }
}
