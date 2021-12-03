import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

@ExtendWith(TestResultLogger.class)
public class BaseTest {

    WebDriver webDriver;

    @BeforeEach
    public void startUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:/Users/testinium/Downloads/chromedriver96.exe");
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.gittigidiyor.com/");

    }

    @AfterEach
    public void tearDown(){
        webDriver.quit();

    }
}
