package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Assertion {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void tesr01(){
        driver.get("https://amazon.com");
    /*   if (driver.getCurrentUrl().equals("https://facebook.com")) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");*/
        String expectedURL="https://facebook.com";
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);

    }
}
