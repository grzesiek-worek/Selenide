package pl.grzegorzworek.selenide.automationbro;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public SelenideElement getStartedBtn() {
        return $(By.id("get-started"));
    }

    public SelenideElement headingTitle() {
        return $("h1");
    }

    public SelenideElement logoLink() {
        return $x("//a[@class=\"custom-logo-link\"]");
    }

    public ElementsCollection linksList() {
        return $$("#primary-menu li[id*=menu-item]");
    }
}
