package webTestCase;

import base_test.BaseTest;
import org.testng.annotations.Test;
import web_pages.LandingPage;
import web_pages.SignupPage;

import java.io.IOException;

public class SignUpAsParticipant extends BaseTest {
    LandingPage landingPage = new LandingPage();
    SignupPage signup = new SignupPage();
    //Click to join as Participant
    @Test
    public void clickOnJoinAsParticipant() {
        landingPage.acceptCookies();
        landingPage.clickOnJoinAsParticipant();
    }
    //Fill the Form with user Data
    @Test
    public void fillFormWithUserData() throws IOException, InterruptedException {
        signup.fillForm();
        signup.fillOTP();
        signup.selectCountry();
        signup.completeRegistration();
    }
    //Check that user has landing to Home page or not.
    @Test
    public void signUpSuccessfully() {
        signup.verifySuccessFullSignup();
    }

    //Take screenshot of Homepage
    @Test
    void takeScreenshot() throws Exception {
        signup.takeScreenshot();
    }

}
