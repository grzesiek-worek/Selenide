package pl.grzegorzworek.selenide.automationbro;

import com.codeborne.selenide.CollectionCondition;
import org.testng.annotations.Test;
import java.util.List;

import static com.codeborne.selenide.Condition.*;

public class HomeTest {

    HomePage homePage = new HomePage();

    @Test
    public void testPageUrlAndTitle(){
        homePage.open()
                .assertUrl("https://practice.automationbro.com/");

        homePage.assertTitleSite("Practice E-Commerce Site – Automation Bro");
    }

    @Test
    public void testInteractingWithElements() {
        homePage.open()
                .getStartedBtn().click();

        homePage.assertUrlContain("get-started");

        homePage.headingTitle().shouldHave(text("Think different. Make different."));

        homePage.logoLink().shouldBe(visible);
    }

    @Test
    public void testMultipleElements() {
        homePage.open();

        List<String> expectedLinks = List.of("Home", "About","Shop", "Blog","Contact","My account");

        homePage.linksList().shouldHave(CollectionCondition.texts(expectedLinks));
    }
}
