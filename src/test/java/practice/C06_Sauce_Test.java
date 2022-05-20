package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Sauce_Test {
          //1. “https://www.saucedemo.com” Adresine gidin
          // 2. Username kutusuna “standard_user” yazdirin
          //3. Password kutusuna “secret_sauce” yazdirin
          //4. Login tusuna basin




          //9. Sayfayi kapatin#
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.saucedemo.com");
    }
    @Test
    public  void test01(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user"+ Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("secret_sauce"+ Keys.ENTER);
        driver.findElement(By.id("login-button")).click();
    }
    @Test
    public void test02(){
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

     WebElement warenNamen= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        System.out.println("Der Name der Waren : "+warenNamen.getText());
        warenNamen.click();
        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_link")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        Assert.assertTrue(driver.findElement(By.className("inventory_item_price")).isDisplayed());
    }
    @AfterClass
    public static void tearDown(){driver.close();}
}
