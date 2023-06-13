package pl.grzegorzworek.selenide.automationbro;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;

public class HomeTest {

    HomePage homePage = new HomePage();

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

        homePage.getStartedBtn().click();

        String url = WebDriverRunner.url();
        assertTrue(url.contains("get-started"));

        homePage.headingTitle().shouldHave(text("Think different. Make different."));

        homePage.logoLink().shouldBe(visible);
    }

    @Test
    public void testMultipleElements() {
        open("https://practice.automationbro.com/");

        List<String> expectedLinks = List.of("Home", "About","Shop", "Blog","Contact","My account");

        //ElementsCollection linkLists = homePage.linksList();

        homePage.linksList().shouldHave(CollectionCondition.texts(expectedLinks));
    }
}
