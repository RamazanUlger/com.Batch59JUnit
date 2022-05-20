package day10_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class C03_MouseActions1 extends TestBase {
     @Test
    public  void test01(){
         //    1- Yeni bir class olusturalim: MouseActions1

         //2- https://the-internet.herokuapp.com/context_menu sitesine gidelim
         driver.get("https://the-internet.herokuapp.com/context_menu");
         String ilkWindowHandle=driver.getWindowHandle();
         //            3- Cizili alan uzerinde sag click yapalim
           Actions action =new Actions(driver);
         WebElement cizgiliBolge=driver.findElement(By.id("hot-spot"));
         action.contextClick(cizgiliBolge).perform();
         //4- Alert’te cikan yazinin “You selected a context menu” oldugunu
         //    test edelim.
           String alertText=driver.switchTo().alert().getText();
           String expectedResult="You selected a context menu";
         Assert.assertEquals(expectedResult,alertText);


         //            5- Tamam diyerek alert’i kapatalim
         driver.switchTo().alert().accept();

         //6- Elemental Selenium linkine tiklayalim
   driver.findElement(By.xpath("//*[.='Elemental Selenium']")).click();
         Set<String> handles=driver.getWindowHandles();
         String ikinciSayfaHandleDegeri="";
         for (String each:handles
              ) {
             if (!each.contains(ilkWindowHandle)) {
                 ikinciSayfaHandleDegeri=each;
             }
         }
         driver.switchTo().window(ikinciSayfaHandleDegeri);
         //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        WebElement webELement= driver.findElement(By.xpath("//*[.='Elemental Selenium']"));
        String actuelText=webELement.getText();
        expectedResult="Elemental Selenium";
        Assert.assertEquals(expectedResult,actuelText);
     }
}
