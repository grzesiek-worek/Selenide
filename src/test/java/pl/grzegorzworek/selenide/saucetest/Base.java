package pl.grzegorzworek.selenide.saucetest;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    @Before
    public void openPage() {
        open("https://www.saucedemo.com/");
    }


    @Test
    public void test(){

    }
}
