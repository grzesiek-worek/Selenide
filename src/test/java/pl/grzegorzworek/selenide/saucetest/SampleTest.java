package pl.grzegorzworek.selenide.saucetest;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SampleTest extends Base{

    @Test
    public void testLoginInAsValidUser(){
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();
        $x(".//span[@class='title']").shouldHave(Condition.exactText("PRODUCTS"));
    }
}
