package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.time.Duration;

public class C07_RadioButton_Test {
   // 1. Bir class oluşturun : RadioButtonTest
   // 2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
   //- https://www.facebook.com adresine gidin

   //- “Create an Account” button’una basin
   //- “radio buttons” elementlerini locate edin
   //- Secili degilse cinsiyet butonundan size uygun olani secin
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");

     }
    @Test
    public void test01()throws InterruptedException{

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.xpath("//html[@id='facebook']"));
        driver.findElement(By.xpath("//*[text()='Erforderliche und optionale Cookies erlauben']")).click();
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        WebElement weiblichRadioButton=driver.findElement(By.xpath("//input[@value='1']"));
        WebElement maenlichRadioButton=driver.findElement(By.xpath("//input[@value='2']"));
        maenlichRadioButton.click();
        Thread.sleep(5000);
    }
}
