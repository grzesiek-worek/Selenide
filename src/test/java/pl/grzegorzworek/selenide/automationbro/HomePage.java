package pl.grzegorzworek.selenide.automationbro;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePage {

    public HomePage open(){
        Selenide.open("https://practice.automationbro.com/");
        return this;
    }

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

    public void assertUrl(String exceptedUrl){
        String url = WebDriverRunner.url();
        assertEquals(url,exceptedUrl);
    }

    public void assertTitleSite(String exceptedTitle){
        String title = title();
        assertEquals(title, exceptedTitle);
    }

    public void assertUrlContain(String textContain) {
        String url = WebDriverRunner.url();
        assertTrue(url.contains(textContain));
    }
}
