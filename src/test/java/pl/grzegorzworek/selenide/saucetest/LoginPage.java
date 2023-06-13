package pl.grzegorzworek.selenide.saucetest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement loginInput = $("#user-name");
    public SelenideElement loginPassword = $("#password");
    public SelenideElement loginButton = $("#login-button");
}
