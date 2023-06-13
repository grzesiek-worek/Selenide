package pl.grzegorzworek.selenide.google;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    @Before
    public void openPage() {
        open("https://www.google.com/");
    }

    @After
    public void clearBrowser() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
