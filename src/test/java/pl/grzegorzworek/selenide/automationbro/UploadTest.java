package pl.grzegorzworek.selenide.automationbro;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class UploadTest {
    @Test
    public void testUploadFileOnVisibleInput() {
        open("https://the-internet.herokuapp.com/upload");
    }
}
