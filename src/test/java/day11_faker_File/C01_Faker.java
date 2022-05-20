package day11_faker_File;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C01_Faker extends TestBase {

    @Test
    public void test01() {
        //facebook ana sayfaya gidip
        driver.get("https://facebook.com");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[.='Erforderliche und optionale Cookies erlauben']")).click();
        Faker fake=new Faker();
        //yeni kayit olustur butonuna basin
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        //isim kutusunu locate edip
        WebElement isimKutusu= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
         String email=fake.internet().emailAddress();
        action.sendKeys(fake.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(fake.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(fake.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("Januar")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

     /*   WebElement geburtsTag=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select=new Select(geburtsTag);
        select.selectByVisibleText("15");
        action.sendKeys(Keys.TAB).sendKeys("Januar")*/
        //geriye kalan alanlari TAB ile dolasarak
        //formu doldurun
    }
}
