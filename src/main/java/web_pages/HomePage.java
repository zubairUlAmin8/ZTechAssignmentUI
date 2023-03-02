package web_pages;

import Utils.waits;
import web_elements.HomepageElements;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomePage extends BasePage{
    HomepageElements homepageElements = new HomepageElements(getDriver());

    public void verifyHomePage() {
        waits.waitForElements(getDriver(), homepageElements.homePageHeader,5000);
    }

    public void enterDataLiveWall() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        homepageElements.liveWallTextArea.sendKeys("The current date and time is "+dtf.format(now));
        waits.clickButton(getDriver(), homepageElements.addPostBtr, 1000);
    }

    public void verifyPostOnLiveWall() {
        waits.waitForElements(getDriver(), homepageElements.firstPostOnLiveWall, 1000);
        System.out.println(homepageElements.firstPostOnLiveWall.getText());
    }

    public void signOut() {
        homepageElements.myAccountIcon.click();
        waits.waitForElements(getDriver(),homepageElements.logoutBtn, 1000);
        homepageElements.logoutBtn.click();
    }
}
