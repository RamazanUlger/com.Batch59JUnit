package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_MavenTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(2000);
        // 2. Signin buttonuna tiklayin#
        WebElement singIn = driver.findElement(By.xpath("//button[@id='signin_button']"));
        singIn.click();
        Thread.sleep(2000);
        // 3. Login alanine  “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        Thread.sleep(2000);
        // 4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        Thread.sleep(2000);
        // 5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        //Online Bankig gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        Thread.sleep(2000);
        // 6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        Thread.sleep(2000);
        // 7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amount=driver.findElement(By.xpath("//input[@id='sp_amount']"));
       // amount.click();
        amount.sendKeys("100");
        Thread.sleep(2000);
        // 8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        Thread.sleep(2000);
        // 9. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();
        Thread.sleep(2000);
        // 10. “The payment was successfully submitted.” mesajinin ciktigini control edin
        WebElement bezahlungIstErfolgt=driver.findElement(By.xpath("//div[@id='alert_content']"));
        String erwartendesErgebnis="The payment was successfully submitted.";
        if (bezahlungIstErfolgt.getText().equals(erwartendesErgebnis)) {
            System.out.println("Der Test wurde mit Erfolg erledigt.");
        }else {System.out.println("Der Test ist nicht erfolgt.");
            System.out.println(bezahlungIstErfolgt.getText());

        }
       driver.close();

    }
}
