package web_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import path_repo.HomepagePR;
import path_repo.LandingPagePR;

public class HomepageElements {

    @FindBy(css = HomepagePR.homePageHeader)
    public WebElement homePageHeader;
    @FindBy(css = HomepagePR.liveWallTextArea)
    public WebElement liveWallTextArea;
    @FindBy(css = HomepagePR.addPostBtr)
    public WebElement addPostBtr;
    @FindBy(css = HomepagePR.firstPostOnLiveWall)
    public WebElement firstPostOnLiveWall;
    @FindBy(css = HomepagePR.myAccountIcon)
    public WebElement myAccountIcon;
    @FindBy(css = HomepagePR.logoutBtn)
    public WebElement logoutBtn;

    WebDriver driver;

    public HomepageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}

