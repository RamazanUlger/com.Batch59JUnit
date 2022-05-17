package day07_assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_YanlisEmail_Test {
  // Bir Class olusturalim YanlisEmailTesti
  // http://automationpractice.com/index.php sayfasina gidelim

  // Email kutusuna @isareti olmayan bir mail yazip enter’a bastigimizda

  static WebDriver driver;
  @BeforeClass
    public static void setUp() {
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("http://automationpractice.com/index.php");
  }
 /* @AfterClass
    public static void tearDown() {
      driver.close();
  }*/
    @Test // Sign in butonuna basalim

    public void test01() {
    driver.findElement(By.xpath("//*[@class='login']")).click();
    }
   @Test
    public void test02() {
       WebElement email= driver.findElement(By.xpath("//*[@id='email']"));
       email.sendKeys("ramazan5887gmail.com"+ Keys.ENTER);
 }
 @Test// “Invalid email address” uyarisi ciktigini test edelim
 public void test03() {
        WebElement emailInValid=driver.findElement(By.xpath("(//*[text()='Invalid email address.']"));


 }
}
