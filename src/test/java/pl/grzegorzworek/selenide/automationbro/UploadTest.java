package pl.grzegorzworek.selenide.automationbro;

import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class UploadTest {
    @Test
    public void testUploadFileOnVisibleInput() {
        open("https://the-internet.herokuapp.com/upload");

        $("#file-upload").uploadFile(new File("src/test/java/pl/grzegorzworek/selenide/dataupload/sample.png"));

        $("#file-submit").click();

        $("h3").shouldHave(text("File Uploaded!"));
    }

    @Test
    public void testUploadFileOnHiddenInput() {
        open("https://practice.automationbro.com/cart/");

        executeJavaScript("document.getElementById(\"upfile_1\").classList.remove(\"file_input_hidden\")");

        $("#upfile_1").uploadFile(new File("src/test/java/pl/grzegorzworek/selenide/dataupload/sample.png"));

        $("#upload_1").click();

        $("#wfu_messageblock_header_1_label_1").shouldHave(text("uploaded successfully"));
    }
}
