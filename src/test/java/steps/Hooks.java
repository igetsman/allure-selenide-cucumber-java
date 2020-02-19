package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openUrl() {
        Configuration.startMaximized=true;
        open("https://security.wildberries.by/login");
    }
/*    @BeforeAll
    public void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }*/
}
