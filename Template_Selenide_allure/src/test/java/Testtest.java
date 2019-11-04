import com.codeborne.selenide.Condition;
import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

@Report
@Listeners(TextReport.class)
public class Testtest extends BaseTest{

    @Test
    public void test() {

        open("http://google.com");
        $(By.xpath("//img[@alt='Google']")).shouldBe(Condition.visible);
    }
}
