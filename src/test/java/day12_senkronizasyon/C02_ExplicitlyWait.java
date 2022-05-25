package day12_senkronizasyon;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C02_ExplicitlyWait extends TestBase {
    @Test
    public void test01() {
       // 1. Bir class olusturun : EnableTest
       // 2. Bir metod olusturun : isEnabled()
       // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
       // 4. Textbox’in etkin olmadigini(enabled) dogrulayın
        WebElement enableTexBox=driver.findElement(By.xpath("//*[@type='text']"));
        Assert.assertFalse(enableTexBox.isEnabled());
       // 5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(enableTexBox));
       // 6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        WebElement itsEnabled=driver.findElement(By.xpath("//p[@id=\"message\"]"));
        Assert.assertTrue(itsEnabled.isDisplayed());
       // 7. Textbox’in etkin oldugunu(enabled) dogrulayın.
        Assert.assertTrue(enableTexBox.isEnabled());
    }
}