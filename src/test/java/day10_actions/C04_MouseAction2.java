package day10_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_MouseAction2 extends TestBase {
    @Test
    public void test01() {
        // Yeni bir class olusturalim: MouseActions2
        // 1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        WebElement dragMe=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drogMe=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

        // 2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        Actions action =new Actions(driver);
        action.dragAndDrop(dragMe,drogMe).perform();

        // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String actualText=driver.findElement(By.xpath("(//*[.='Dropped!'])[2]")).getText();
        String expectedText="Dropped!";
        Assert.assertEquals(expectedText,actualText);
    }
    }

