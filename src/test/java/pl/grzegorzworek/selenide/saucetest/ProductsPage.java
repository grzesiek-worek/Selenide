package pl.grzegorzworek.selenide.saucetest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    public SelenideElement productTitle = $x(".//span[@class='title']").as("{site title}");
}
