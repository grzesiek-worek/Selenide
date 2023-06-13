package pl.grzegorzworek.selenide.automationbro;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.*;
import static com.codeborne.selenide.Selenide.open;

public class HomeTest {

    @Test
    public void testPageUrlAndTitle(){
        open("https://practice.automationbro.com/");

        String url = WebDriverRunner.url();
        assertEquals(url,"https://practice.automationbro.com/");

        String title = title();
        assertEquals(title,"Practice E-Commerce Site – Automation Bro");
    }
}
