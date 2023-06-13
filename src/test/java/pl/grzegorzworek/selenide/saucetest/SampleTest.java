package pl.grzegorzworek.selenide.saucetest;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class SampleTest extends Base{

    LoginPage loginPage = page(LoginPage.class);
    ProductsPage productsPage = page(ProductsPage.class);

    @Test
    public void testLoginInAsValidUser(){
        //Given
        loginPage.loginInput.setValue("standard_user");
        loginPage.loginPassword.setValue("secret_sauce");

        //when
        loginPage.loginButton.click();

        //Then
        productsPage.productTitle.shouldHave(Condition.exactText("PRODUCTS"));
    }
}
