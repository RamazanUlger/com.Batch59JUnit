package day10_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //Amazona gidelim
        //Account menusunden  creat a list linkini tiklayim
        driver.get("https://www.amazon.com");
        Actions action=new Actions(driver);
        WebElement neuKonto=driver.findElement(By.xpath("(//*[.='Hallo, Anmelden'])[2]"));

        action.moveToElement(neuKonto).perform();
        driver.findElement(By.xpath("(//*[.='Neue Liste anlegen '])[2]")).click();
       Thread.sleep(5000);

    }


}

