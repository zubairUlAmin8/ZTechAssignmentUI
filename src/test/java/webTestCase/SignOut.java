package webTestCase;

import base_test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import web_pages.HomePage;

public class SignOut extends BaseTest {

    HomePage homePage = new HomePage();

    //Logout User's Account
    @Test
    public void userSignOut() {
        homePage.signOut();
    }
}
