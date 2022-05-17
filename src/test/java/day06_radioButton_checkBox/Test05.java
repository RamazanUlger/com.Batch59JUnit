package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test05 {
    static WebDriver driver;
    WebElement webELement;

    WebElement erwateteWare;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    //   1. “https://www.saucedemo.com” Adresine gidin
    public void webSeiteRuf() {
        driver.get("https://www.saucedemo.com");
        //   2. Username kutusuna “standard_user” yazdirin
        //3. Password kutusuna “secret_sauce” yazdirin
        //4. Login tusuna basin
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.click();
        userName.sendKeys("standard_user" + Keys.ENTER);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("secret_sauce" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Test
    public void test01() throws InterruptedException {

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        webELement = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));

        webELement.click();
        //6. Add to Cart butonuna basin
        // 7. Alisveris sepetine tiklayin
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[text()='Add to cart']")).click();

    }

    //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
    @Test
    public void sepet() {
        Test05 tes05 = new Test05();
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
        erwateteWare = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']]"));

        if (webELement.equals(erwateteWare)) {
            System.out.println("Esit");
        }else System.out.println("Degil");
       // Assert.assertEquals(erwateteWare, webELement);
    }

    //9. Sayfayi kapatin
    @AfterClass
    public static void tearDown() {
        /*try {
            Thread.sleep(5000);
            driver.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    */
    }
}
