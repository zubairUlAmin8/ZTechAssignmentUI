package webTestCase;

import base_test.BaseTest;
import org.testng.annotations.Test;
import web_pages.LandingPage;
import web_pages.SignupPage;

import java.io.IOException;

public class SignUpAsParticipant extends BaseTest {
    LandingPage landingPage = new LandingPage();
    SignupPage signup = new SignupPage();

    @Test
    public void clickOnJoinAsParticipant() {
        landingPage.acceptCookies();
        landingPage.clickOnJoinAsParticipant();
    }

    @Test
    public void fillFormWithUserData() throws IOException, InterruptedException {
        signup.fillForm();
        signup.fillOTP();
        signup.selectCountry();
        signup.completeRegistration();

    }

    @Test
    public void signUpSuccessfully() {
        signup.verifySuccessFullSignup();
    }


    @Test
    void takeScreenshot() throws Exception {
        signup.takeScreenshot();
    }

}
