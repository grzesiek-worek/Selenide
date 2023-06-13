package pl.grzegorzworek.selenide.saucetest;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    @Before
    public void openPage() {
        open("https://www.saucedemo.com/");
    }

    @After
    public void clearBrowser() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
