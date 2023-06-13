package pl.grzegorzworek.selenide.automationbro;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @Test
    public void testFormFields() {
        open("https://practice.automationbro.com/support-form");

        $(".support-name input").val("Greg");
        $(".support-email input").val("test@gmail.com");
        $(".support-subject input").val("Need help with repairing my shop");

        $(".support-dropdown input").selectOption("Technical Team");

    }
}
