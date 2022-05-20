package day09_handleWindows_testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WindowHandle {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {
        driver.close();

    }

    @Test
    public void test01() {
        // 1- amazon anasayfaya gidelim
        driver.get("https://www.amazon.com");
        String ilkSayfaHandleDegeri= driver.getWindowHandle();
        // 2- url'in  amazon icerdigini test edelim
        String expectedURL="https://www.amazon.com";
        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL));

        // 3- yeni bir pencere acip bestbuy ana sayfaya gidelim
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://www.bestbuy.com");
       String ikinciSayfaHandleDegeri= driver.getWindowHandle();
        // 4- title'in BestBuy icerdigini test edelim
        String expectedTitel="Best Buy";
        String actualTitel=driver.getTitle();
        // 5- ilk sayfaya donup sayfada java aratalim
       driver.switchTo().window(ilkSayfaHandleDegeri);
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java" + Keys.ENTER);

        // 6- arama sonuclarinin Java icerdigini test edelim
        WebElement aramaSonuclari=driver.findElement(By.xpath("//span [@class=\"a-color-state a-text-bold\"]"));
        String actualText=aramaSonuclari.getText();
        String expectedText="Java";
        Assert.assertTrue(actualText.contains(expectedText));


        // 7- yeniden bestbuy'in acik oldugu sayfaya gidelim
        driver.switchTo().window(ikinciSayfaHandleDegeri);
        driver.get("https://bestbuy.com");

        // 8- logonun gorundugunu test edelim
        Assert.assertTrue(driver.findElement(By.className("logo")).isDisplayed());

    }
}
