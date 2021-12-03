import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage {
    By searchBoxBy = By.xpath("//input[@type='text']");
    By accountButtonBy = By.cssSelector("div[title='Hesabım']");
    By login = By.cssSelector("div[title='Giriş Yap']");
    By logins = By.cssSelector("a[data-cy='header-login-button']");
    By out = By.cssSelector("div[name='profile']");
    By outs = By.xpath("(//a[@class='sc-84am1q-0 sc-1r48nyr-0 dGMkVn sc-12t95ss-6 jfpyWy'])[16]");


    WebDriver webDriver;


    public HomePage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }


    public SearchResultPage search(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword + Keys.ENTER);
        return new SearchResultPage(webDriver);
    }


    public LoginPage getLoginPage(){

        webDriver.findElement(login).click();
        webDriver.findElement(logins).click();
        return new LoginPage(webDriver);
    }
    public String getAccountText(){

        return webDriver.findElement(accountButtonBy).getText();

    }

    public void scrollToPage(){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public void anasayfadon(){

        webDriver.get("https://www.gittigidiyor.com/");

    }

    public void loginout(){
        webDriver.findElement(out).click();
        webDriver.findElement(outs).click();

    }


}
