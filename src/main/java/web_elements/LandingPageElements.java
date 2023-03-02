package web_elements;

import path_repo.LandingPagePR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageElements {

     @FindBy(css = LandingPagePR.joinAsParticipantButton)
    public WebElement joinAsParticipantButton;
  @FindBy(css = LandingPagePR.acceptAllCoolies)
    public WebElement acceptAllCoolies;

    WebDriver driver;

    public LandingPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
