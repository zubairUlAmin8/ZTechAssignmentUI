package web_pages;

import Utils.waits;
import dev.failsafe.internal.util.Assert;
import web_elements.LandingPageElements;

public class LandingPage extends BasePage {
    LandingPageElements landingPageElements = new LandingPageElements(getDriver());

    public void clickOnJoinAsParticipant() {
        waits.waitForElements(getDriver(),landingPageElements.joinAsParticipantButton,300);
        landingPageElements.joinAsParticipantButton.click();
    }

    public void acceptCookies() {
        landingPageElements.acceptAllCoolies.click();
    }

}
