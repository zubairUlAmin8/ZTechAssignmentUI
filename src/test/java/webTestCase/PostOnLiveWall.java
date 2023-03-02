package webTestCase;

import base_test.BaseTest;
import org.testng.annotations.Test;
import web_pages.HomePage;

public class PostOnLiveWall extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void writeOnLiveWall() {
        homePage.enterDataLiveWall();
    }
    @Test
    public void verifyPost() {
        homePage.verifyPostOnLiveWall();
    }
}
