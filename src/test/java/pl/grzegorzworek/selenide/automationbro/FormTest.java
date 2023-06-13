package pl.grzegorzworek.selenide.automationbro;

import com.codeborne.selenide.Condition;
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
        $(".support-checkboxes ul li:nth-child(2) input").click();
        $(".support-date input").click();
        $(".flatpickr-day.nextMonthDay").click();

        $("button[type=submit]").click();
        $("div[role=alert").shouldHave(Condition.text("Thanks for contacting us! We will be in touch with you shortly."));
    }
}
