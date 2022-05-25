package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ActionsMethodlari extends TestBase {
    @Test
    public void test01() throws InterruptedException {
      // Yeni Class olusturun ActionsClassHomeWork
      // 1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
      // 2- Hover over Me First" kutusunun ustune gelin
        WebElement overMeFirst=driver.findElement(By.xpath("//*[.='Hover Over Me First!']"));
        Actions action =new Actions(driver);
        action.moveToElement(overMeFirst).perform();
        // 3- Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[text()='Link 1'])[1]")).click();
      // 4- Popup mesajini yazdirin
        String popUpText=driver.switchTo().alert().getText();
        System.out.println("PopUp'in icindeki mesaj : "+popUpText);
      // 5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
      // 6- “Click and hold" kutusuna basili tutun
        WebElement webElementclickAndHold=driver.findElement(By.xpath("//div[@id='click-box']"));
        action.clickAndHold(webElementclickAndHold).perform();
      // 7-“Click and hold" kutusunda cikan yaziyi yazdirin
        Thread.sleep(5000 );
        String clickAndHoldText=webElementclickAndHold.getText();
        System.out.println("Bas ve tut tusunun uzerindeki yazi : "+clickAndHoldText);
      // 8- “Double click me" butonunu cift tiklayin
  WebElement ciftTikla=driver.findElement(By.xpath("//*[@id='double-click']"));
  action.doubleClick(ciftTikla); String ikinciSayfaHandleDegeri="";


    }
}
