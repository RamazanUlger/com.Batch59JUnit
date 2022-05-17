package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Nutella {
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
    public void TestGoogle() {
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        WebElement Kontrol = driver.findElement(By.xpath("//img[@srcset='/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png 1x, /images/branding/googlelogo/2x/googlelogo_color_272x92dp.png 2x']"));
        if (Kontrol.isDisplayed()) {
            System.out.println("Test is PASSED");
        } else {
            System.out.println("Test is FAILED");
        }
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nutella" + Keys.ENTER);
        List<WebElement> istenenElementListesi = driver.findElements(By.xpath("//div[@id='result-stats']"));
        WebElement s1 = istenenElementListesi.get(0);
        String s2 = s1.getText();
        String s3 = s2.substring(9, 20);
        String s4 = s3.replace(".", "");

        long s5 = Integer.parseInt(s4);
        Assert.assertFalse("Son deger : ", s5>10000000);
       /* if (s5 > 10000000) {
            System.out.println("passed " +
                    s5);
        } else {
            System.out.println("failed");
        }*/
    }
}