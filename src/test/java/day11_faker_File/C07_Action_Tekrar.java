package day11_faker_File;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public  class C07_Action_Tekrar extends TestBase {
    @Test
    public void test01() {
     //  1- Bir Class olusturalim KeyboardActions2

     //  2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/ ");

     //  3- video’yu gorecek kadar asagi inin
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();

     //  4- videoyu izlemek icin Play tusuna basin
        WebElement youTube=driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
       driver.switchTo().frame(youTube);
        driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']")).click();

     //  5- videoyu calistirdiginizi test edin
        WebElement youTubeLogo =driver.findElement(By.xpath("//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
  Assert.assertTrue(youTubeLogo.isDisplayed());
    }
}
