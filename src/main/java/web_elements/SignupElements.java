package web_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import path_repo.LandingPagePR;
import path_repo.SignupPR;

public class SignupElements {
    @FindBy(css = SignupPR.firstName)
    public WebElement firstName;
    @FindBy(css = SignupPR.lastName)
    public WebElement lastName;
    @FindBy(css = SignupPR.emailAddress)
    public WebElement emailAddress;
    @FindBy(css = SignupPR.password)
    public WebElement password;
    @FindBy(css = SignupPR.passwordConfirmation)
    public WebElement passwordConfirmation;
    @FindBy(css = SignupPR.uploadFile)
    public WebElement uploadFile;
    @FindBy(css = SignupPR.termNCondition)
    public WebElement termNCondition;
    @FindBy(css = SignupPR.submitButton)
    public WebElement submitButton;
    @FindBy(css = SignupPR.OTP)
    public WebElement OTP;
    @FindBy(css = SignupPR.countryList)
    public WebElement countryList;
    @FindBy(css = SignupPR.countryAllList)
    public WebElement countryAllList;
    @FindBy(css = SignupPR.eventPrivacyPolicy)
    public WebElement eventPrivacyPolicy;
    @FindBy(css = SignupPR.completeRegistrationBtn)
    public WebElement completeRegistrationBtn;

    WebDriver driver;

    public SignupElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
