package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {
    @Test
    public void projectIsOpen() {
        loginPage
                .openPage()
                .login();
        projectsPage.headerCheck();
    }
}
