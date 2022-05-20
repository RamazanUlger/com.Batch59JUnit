package day10_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C06_KeyBoard_Actions extends TestBase {
    @Test
    public void test01() {
        //facebook ana sayfaya gidip
        driver.get("https://facebook.com");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[.='Erforderliche und optionale Cookies erlauben']")).click();

        //yeni kayit olustur butonuna basin
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        //isim kutusunu locate edip
        WebElement isimKutusu= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));

        action.keyDown(Keys.SHIFT)
                .sendKeys("r")
                .keyUp(Keys.SHIFT)
                .sendKeys("a")
                .sendKeys("m")
                .sendKeys("a")
                .sendKeys("z")
                .sendKeys("a")
                .sendKeys("n")
                .sendKeys(Keys.TAB)
                .sendKeys("Ulger")
                .sendKeys(Keys.TAB)
                .sendKeys("ramazan5879645@gugil.kom")
                .sendKeys(Keys.TAB)
                .sendKeys("ramazan5879645@gugil.kom")
                .sendKeys(Keys.TAB)
                .sendKeys("Cossada24123456").perform();
        WebElement geburtsTag=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select=new Select(geburtsTag);
        select.selectByVisibleText("15");
        action.sendKeys(Keys.TAB).sendKeys("Januar")
                .sendKeys(Keys.TAB).sendKeys("1987")
                .sendKeys(Keys.TAB).keyUp(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN).perform();


        //geriye kalan alanlari TAB ile dolasarak
        //formu doldurun
    }
}
