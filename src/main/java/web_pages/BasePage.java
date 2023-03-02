package web_pages;

import Utils.DriverSetup;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver getDriver(){
        return DriverSetup.initDrier();

    }
    public void loadPage(String base_url){
         getDriver().get(base_url);
    }
}
