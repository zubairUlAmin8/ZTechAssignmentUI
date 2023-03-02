package web_pages;

import Utils.utility;
import Utils.waits;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import web_elements.HomepageElements;
import web_elements.SignupElements;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SignupPage extends BasePage {
    SignupElements signupElements = new SignupElements(getDriver());
    HomepageElements homepageElements = new HomepageElements(getDriver());

    public void fillForm() throws IOException {
        String fName= utility.getValue("FirstName");
        String lName= utility.getValue("LastName");
        String email= utility.getValue("Email");
        String password= utility.getValue("Password");
        String ConfirmPassword= utility.getValue("ConfirmPassword");

        signupElements.firstName.sendKeys(fName);
        signupElements.lastName.sendKeys(lName);
        signupElements.emailAddress.sendKeys(email);
        signupElements.password.sendKeys(password);
        signupElements.passwordConfirmation.sendKeys(ConfirmPassword);
        uploadFile();
        signupElements.termNCondition.click();
        signupElements.submitButton.click();
    }

    public void uploadFile() {
        WebElement uploadFile=getDriver().findElement(By.cssSelector("#file"));
        String currentDirectory=System.getProperty("user.dir");
        String fileDirectory="\\TestData\\man1.png";
        String compPath=currentDirectory+fileDirectory;
        uploadFile.sendKeys(compPath);
    }
    public void fillOTP() {
        waits.waitForElements(getDriver(), signupElements.OTP, 1000);

        List<WebElement> element=signupElements.OTP.findElements(By.tagName("input"));

        for(WebElement selectLi: element)
        {
            selectLi.sendKeys("5");
        }

    }

    public void selectCountry() throws IOException {
        waits.waitForElements(getDriver(), signupElements.countryList, 2000);
        signupElements.countryList.click();

        waits.waitForElements(getDriver(), signupElements.countryAllList, 1000);

        List<WebElement> element=signupElements.countryAllList.findElements(By.tagName("li"));

        for(WebElement selectLi: element)
        {
            String country=utility.getValue("Country");
            if (selectLi.getText().equals(country)) {
                selectLi.click();
            }

        }

    }

    public void completeRegistration() {
        try {
            signupElements.eventPrivacyPolicy.click();
        } catch(StaleElementReferenceException e) {
            getDriver().navigate().refresh();
            getDriver().findElement(By.cssSelector("eventPrivacyPolicy")).click();
        }
        signupElements.completeRegistrationBtn.click();

    }
    //This method take the screenshot and saved in the given directory.
    public void takeScreenshot() throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String filePath = "TestResults/FIRST_"+dtf.format(now)+".png";
        filePath = filePath.replace(":", "-");
        utility.takeSnapShot(getDriver(), filePath);
    }
    public void verifySuccessFullSignup() {
        waits.waitForElements(getDriver(), homepageElements.homePageHeader,5000);
    }

}
