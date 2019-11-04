import BrowserConfig.MyChromeBrowserClass;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.BrowserPerClass;
import com.codeborne.selenide.testng.TextReport;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;


@Listeners({TextReport.class, BrowserPerClass.class})
public class BaseTest {



    @BeforeClass
    public static void beforeClass(){
        Configuration.browser = MyChromeBrowserClass.class.getName();
        Configuration.startMaximized = true;
    }



}
