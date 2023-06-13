package pl.grzegorzworek.selenide.automationbro;

import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UploadTest {
    @Test
    public void testUploadFileOnVisibleInput() {
        open("https://the-internet.herokuapp.com/upload");
        $("#file-upload").uploadFile(new File("src/test/java/pl/grzegorzworek/selenide/data/sample.png"));
    }
}
