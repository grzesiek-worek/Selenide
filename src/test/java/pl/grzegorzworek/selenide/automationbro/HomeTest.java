package pl.grzegorzworek.selenide.automationbro;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;

public class HomeTest {

    @Test
    public void testPageUrlAndTitle(){
        open("https://practice.automationbro.com/");

        String url = WebDriverRunner.url();
        assertEquals(url,"https://practice.automationbro.com/");

        String title = title();
        assertEquals(title,"Practice E-Commerce Site – Automation Bro");
    }

    @Test
    public void testInteractingWithElements() {
        open("https://practice.automationbro.com/");

        $(By.id("get-started")).click();

        String url = WebDriverRunner.url();
        assertTrue(url.contains("get-started"));

        $("h1").shouldHave(text("Think different. Make different."));

        $x("//a[@class=\"custom-logo-link\"]").shouldBe(visible);
    }
}
