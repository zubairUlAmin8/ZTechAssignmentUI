package webTestCase;

import base_test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import web_pages.HomePage;

public class SignOut extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void userSignOut() {
        homePage.signOut();
    }

//    @Test
//    public void upload() throws InterruptedException {
//        getDriver().get("https://app.demo.onvent.online/event/test-event-DUpnBEjXK6/register?registerAsParticipant=true");
//
//        WebElement m=getDriver().findElement(By.cssSelector("#file"));
//        String currentDirectory=System.getProperty("user.dir");
//        String fileDirectory="\\TestData\\man1.png";
//        String compPath=currentDirectory+fileDirectory;
//        System.out.println("Working Directory = " + System.getProperty("user.dir"));
//        System.out.println("Complete Directory = " + compPath);
//        // file selection field with file path
////        m.sendKeys("D:\\mywork\\automation\\ZTechAssignmentUI\\TestData\\man1.png");
//        m.sendKeys(compPath);
//    }
}
