package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectsPage;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseTest {
    LoginPage loginPage;
    ProjectsPage projectsPage;


    @BeforeMethod
    public void SetUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 60000;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://app.qase.io/";

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
    }

    /*@AfterMethod
    public void closeWindow() {
        Selenide.closeWebDriver();
        Selenide.clearBrowserCookies();

    }*/
}
