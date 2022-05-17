package day07_assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C04_DropDownMenu {
    /*
    Amazona gidip
    dropdowndan books secenegini secip
    Java Aratalim
    ve arama sonuclarinin java  icerip icermedigini kontrol edin
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
        driver.get("https://www.amazon.com");

        //DropDown'dan bir option sercmek icin uc adim vardir
        // 1-dropdoen locate edelim

        WebElement ddmElement=driver.findElement(By.xpath("//*[@id='searchDropdownDescription']"));

        //2 - Adim bir select objesi
        //parametre olarak bir onceki adimda locate ettigimiz elementi koyalim
        Select select=new Select(ddmElement);
        // 3- Adim Dropdown'da var olan optionslardan birini secelim
        select.selectByVisibleText("Bücher");
       // select.selectByIndex(13);
        select.selectByValue("search-alias=stripbooks");
        // 4- Adim arama kutusuna Java yazdiralim
        WebElement sucheLeiste=driver.findElement(By.id("twotabsearchtextbox"));
        sucheLeiste.sendKeys("Java"+ Keys.ENTER);

    }

}
