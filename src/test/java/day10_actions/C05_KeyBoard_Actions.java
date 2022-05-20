package day10_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C05_KeyBoard_Actions extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // once aram kutusuna click
        Actions action = new Actions(driver);
        // sonra harf harf Nutella yollayalim
        //sonra da ENTER tusuna basalim
        action.click(aramaKutusu).
                keyDown(Keys.SHIFT).
                sendKeys("n").keyUp(Keys.SHIFT).
                sendKeys("u").
                sendKeys("t").
                sendKeys("e")
                .sendKeys("l")
                .sendKeys("l")
                .sendKeys("a")

                .sendKeys(Keys.ENTER);




    }
}
