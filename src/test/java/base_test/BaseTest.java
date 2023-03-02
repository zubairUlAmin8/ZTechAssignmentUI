package base_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import web_pages.BasePage;

public class BaseTest {
    protected BasePage basePage = new BasePage();

    @BeforeClass
    public WebDriver getDriver() {

        return basePage.getDriver();
    }

    @BeforeTest
    public void check() {
        String className = this.getClass().getSimpleName();
        System.out.println(className);
       
    }

    @AfterTest
    public void closeDriver() {
//    getDriver().close();
    }

}


