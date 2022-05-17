import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C05_DropDownOptions {
    /*
   1- Amazon anasayfaya gidip
    dropdown menuden books'u secelim
    sectigimiz optini yazdiralim
    2 - Dropdown'daki  elamanlarin 20'e esit oldugunu kontrol edelim
    */
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){driver.quit();}
    @Test
    public void test01(){
        driver.get("https://www.aamazon.com");
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Bücher");
        //bir dopdown ile calissiyorken son secilen optiona ulasmak icin
        //select.getFirstSelectedOption() method'unu kullanmaliyiz
        //bu method bize WebElement dondurur
        //uzerinde´ki yaziyi almak icin getText() method'u unutulmamalidir
        //select.getFirstSelectedOption().getText()
        System.out.println(select.getFirstSelectedOption().getText());

        List<WebElement> optionList=select.getOptions();
        int actualOptionSayisi=optionList.size();
        int beklenenOptionSayisi=28;
        Assert.assertEquals(actualOptionSayisi,beklenenOptionSayisi);


    }
}
