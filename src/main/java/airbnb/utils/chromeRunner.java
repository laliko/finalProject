package airbnb.chrome;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class chromeRunner {
    @BeforeTest
    public void login() {
        Configuration.browser = "airbnb/chrome";
        System.setProperty("webdriver.airbnb.com.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.airbnb.com/");
    }
    @AfterTest
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.close();
    }
}
