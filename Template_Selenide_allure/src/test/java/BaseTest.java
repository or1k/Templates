import BrowserConfig.MyChromeBrowserClass;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.BrowserPerClass;
import com.codeborne.selenide.testng.TextReport;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;


@Listeners({TextReport.class, BrowserPerClass.class})
public class BaseTest {



    @BeforeClass
    public static void beforeClass(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        Configuration.browser = MyChromeBrowserClass.class.getName();
        Configuration.startMaximized = true;
    }



}
