package day07_assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BestBuy_Test {
    static WebDriver driver;

    // 2) https://www.bestbuy.com/ Adresine gidin
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");
    }

    //    farkli test method’lari olusturarak asagidaki testleri yapin
    //      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    @Test
    public void test01() {
        String expectedURL = "https://www.bestbuy.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    @Test
    public void test02() {
        String istenmeyenKelime = "Rest";
        String actualTitel = driver.getTitle();
        Assert.assertFalse(actualTitel.contains(istenmeyenKelime));
    }

    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    @Test
    public void test03() {
        WebElement logoElement = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logoElement.isDisplayed());
    }

    //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
    @Test
    public  void test04(){
        WebElement linkElement=driver.findElement(By.xpath("//*[text()='Français']"));
    }
}
