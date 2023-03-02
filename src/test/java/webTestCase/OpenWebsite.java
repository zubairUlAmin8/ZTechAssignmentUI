package webTestCase;

import Utils.utility;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class OpenWebsite extends BaseTest {

    @Test
    public void OpenBrowser() throws IOException {
        String url_Address = utility.getValue("baseURL");
        basePage.loadPage(url_Address);
        String title=getDriver().getTitle();
//        Assert.assertEquals(title, utility.getValue("Title"));
    }

}
