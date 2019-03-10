package by.moiseenko.testDataProvider;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSuiteAnnotationAgain {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("====BEFORE TESTING DATA PROVIDER ANNOTATION SUITE=====");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("====AFTER TESTING DATA PROVIDER ANNOTATION SUITE=====");
    }
}
