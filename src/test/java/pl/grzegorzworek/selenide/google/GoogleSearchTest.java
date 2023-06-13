package pl.grzegorzworek.selenide.google;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchTest extends Base{

    @Test
    public void searchKeywordWithGoogle(){

        $(By.id("W0wltc")).click(); // cookies reject button

        $(By.name("q")).setValue("Selenide").pressEnter();

        $(By.tagName("h3")).shouldHave(Condition.exactText("Selenide: concise UI tests in Java"));
        $$("#res .g").shouldHave(CollectionCondition.size(9));
    }
}