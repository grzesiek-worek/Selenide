package pl.grzegorzworek.selenide.google;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchTest extends Base{

    @Test
    public void searchKeywordWithGoogle(){

        $(By.name("q")).setValue("Selenide").pressEnter();
    }
}