package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTagAndText;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectsPage {
    private final SelenideElement title = $x("//h1[@class='uA6zAY']");
    private final ElementsCollection titles = $$x("//tr//a");

    public void headerCheck(){
        title.should(exist).shouldBe(visible);
        titles.findBy(text("Sharelane")).shouldBe(exist);

    }
}
