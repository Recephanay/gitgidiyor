import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By emailBy = By.id("L-UserNameField");
    By passwordBy = By.id("L-PasswordField");
    By submit = By.id("gg-login-enter");

    WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage login(String email, String password) {

        webDriver.findElement(emailBy).sendKeys(email);
        webDriver.findElement(passwordBy).sendKeys(password);
        webDriver.findElement(submit).click();
        return new HomePage(webDriver);


    }
}
