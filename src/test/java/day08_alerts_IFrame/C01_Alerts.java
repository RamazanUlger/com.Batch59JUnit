package day08_alerts_IFrame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Alerts {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {driver.close();
    }

    @Test
    public void test() throws InterruptedException{
        //herhangi bir Web Sitesine gidince veya bir
        // WebSitesinde herhangi bir islem
        //yaptigimizda ortaya cikan uyarilara "Alert" diyoruz
        // Eger bir alert inspect(inceleme) yapalibiliniyorsa o alert
        //otomasyon ile  kullanilabilir
        //tum web elementler gibi locate edip istedigimiz islemleri yapabiliriz

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
    driver.switchTo().alert().accept(); //ve dogru sonuc "You successfully clicked an alert"
         //Alert'de OK tusuna basin ve result'da  "You successfully clicked an alert"
        String expectedResult="You successfully clicked an alert";
        WebElement schreibELement=driver.findElement(By.xpath("//p[@id='result']"));

       Assert.assertEquals(schreibELement.getText(),expectedResult);
    }

}
