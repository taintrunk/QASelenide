package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private final SelenideElement userInput = $(By.cssSelector("input[placeholder='Work email']"));
    private final SelenideElement passwordInput = $(By.cssSelector("input[placeholder='Password']"));
    private final SelenideElement submitBtn = $(By.cssSelector("[class=\"exOCAW Ipyboe DP8pcY\"]"));

    public LoginPage openPage(){
        open("login");
        return this;
    }

    public LoginPage login(){
        userInput.setValue("tashapas3579@gmail.com");
        passwordInput.setValue("OCmaryland");
        submitBtn.submit();
        return this;
    }
}
