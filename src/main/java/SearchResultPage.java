import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SearchResultPage{

    By getresultext = By.className("m96g9g-1");
    By searchBoxBy = By.xpath("//input[@type='text']");
    By addto = By.cssSelector("div[class='sc-533kbx-0 sc-1v2q8t1-0 iCRwxx ixSZpI sc-1n49x8z-12 bhlHZl']");
    By addbo = By.id("add-to-basket");
    By product = By.className("basket-title");
    By compl = By.className("gg-ui-btn-lg");
    By post  = By.className("post-address-button");
    By arrage = By.xpath("//*[@id='CCPost']/div[1]/div[5]/div[1]/div/table/tbody/tr/td[3]/p/a");
    By favori = By.cssSelector("a[class='gg-ui-btn-default btn-add-to-basket']");
    By dfavori = By.cssSelector("a[class='btn-delete btn-update-item']");

    WebDriver webDriver;


    public SearchResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public String getResulText() {
        return webDriver.findElement(getresultext).getText();
    }

    public void random(){

        List<WebElement> allProducts = webDriver.findElements(By.name("like"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();

    }
      public void setSearchTextModel(String value){
        webDriver.findElement(searchBoxBy).sendKeys(value + Keys.ENTER);

    }
    public  void addToCart(){

        webDriver.findElements(addto).get(6).click();
    }
    public void tıkla(){
        webDriver.findElement(addbo).click();
    }
    public void productEnhancement(){

        webDriver.findElement(product).click();
    }

    public void increase(){
        Select select = new Select(webDriver.findElement(By.cssSelector("select[class='amount']")));
        select.selectByVisibleText("2");
    }
    public void completionn(){

        webDriver.findElement(compl).click();
    }
   public void saves(){
        webDriver.findElement(post).click();
   }
   public void arrangementt(){
        webDriver.findElement(arrage).click();
   }

   public void addFavorite(){
        webDriver.findElement(favori).click();
   }
   public void deleteFavorite(){
        webDriver.findElement(dfavori).click();
   }
   public void plating(){

       ((JavascriptExecutor) webDriver).executeScript("window.open()");
       ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
       webDriver.switchTo().window(tabs.get(1));
       webDriver.get("https://www.gittigidiyor.com/");

   }
   public void tabkapa(){
       ((JavascriptExecutor) webDriver).executeScript("window.open()");
       ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
       webDriver.get("https://www.gittigidiyor.com/cikis-yap");
       webDriver.switchTo().window(tabs.get(0));
       webDriver.close();
   }



}



