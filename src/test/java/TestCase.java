import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCase extends BaseTest {


    @Test
    public void searchSearch() {

        Log log = new Log();

        log.info("Go to Login Page.");
        String keyword = "bilgisayar";
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = homePage.getLoginPage();
        loginPage.login("test37@gmail.com","15711571203h");
        log.info("Go to Home Page");
        String accountButtonText = homePage.getAccountText();
        log.info("The text written on the My Account button is: " + accountButtonText);
        assertTrue(accountButtonText.contains("Hesabım"));
        log.info("Girdiniz...");
        SearchResultPage searchResultPage = homePage.search(keyword);
        log.info("The word 'bilgisayar' is entered in the search box");
        String resultText = searchResultPage.getResulText();
        assertTrue(resultText.contains("bilgisayar"));
        log.info("Kelimeler Doğrulandı.");
        homePage.scrollToPage();;
        log.info("Sayfa Sonu İndi");
        searchResultPage.random();
        searchResultPage.random();
        log.info("Random Ürünü favorilerime eklendi");
        homePage.anasayfadon();
        log.info("Anasayfaya dönüş yapıldı");
        assertTrue(accountButtonText.contains("Hesabım"));
        searchResultPage.setSearchTextModel("Canta");
        String resultText1 = searchResultPage.getResulText();
        assertTrue(resultText1.contains("Canta"));
        log.info("Çanta aratıldı");
        searchResultPage.addToCart();
        log.info("Çanta sepete eklendi");
        searchResultPage.tıkla();
        log.info("Sepetteki ürün adedi arttı");
        searchResultPage.productEnhancement();
        log.info("Ödeme sayfasına geçildi.");
        searchResultPage.increase();
        log.info("Adres bilgileri kaydet butonuna tıklandı ve hata mesajı alındı");
        searchResultPage.completionn();
        log.info("Sepet Düzenleme yapıldı");
        searchResultPage.saves();
        log.info("Favorilerden 2.ürün eklendi");
        searchResultPage.arrangementt();
        searchResultPage.addFavorite();
        log.info("Sepetten ürün cıkarıldı");
        searchResultPage.deleteFavorite();
        log.info("Sepetten ürün cıkarıldı");
        searchResultPage.plating();
        log.info("Yan tabdan anasayfayı açıldı");
        homePage.loginout();
        log.info("log out olundu");
        searchResultPage.tabkapa();
        log.info("Tab kapatıldı");



    }


}
