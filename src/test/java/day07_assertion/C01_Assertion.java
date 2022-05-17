package day07_assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertion {
   static WebDriver driver;
  @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://www.amazon.com");
    }
     @AfterClass
    public static void tearDown() {driver.close();
  }

    @Test
    //Amazon anasayfaya gidin
    // 1- URL'in amazon icerdiginiz test edin
    public void testr(){

      String aranenKelime="amazon";
      String actualURL=driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(aranenKelime));
  }@Test
  public void test02(){
      // 2- Facebook icermedigini test edin
      String istenmeyenKelime ="facebook";
      String actualTitel=driver.getTitle();
      Assert.assertFalse(actualTitel.contains(istenmeyenKelime));

  }
  @Test
    public  void  test03(){
      // 3- sol ust kose de amazon logosunun gorundugunu test edin
      WebElement logoElementi=driver.findElement(By.id("nav-logo-sprites"));
  Assert.assertTrue(logoElementi.isDisplayed());
  }

    //uc farkli tst methodeu olusturarak asaagida ki goreveleri yapin





}
