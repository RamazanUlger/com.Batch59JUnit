package day09_handleWindows_testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class C03_WindowHandles {
  static  WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {
        driver.close();

    }
    @AfterClass
    public static void quit(){
        driver.quit();
    }

    @Test
    public void test01() {
     // ● Tests package’inda yeni bir class olusturun: WindowHandle2
     //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows ");
        String ersterWindowHandleWert=driver.getWindowHandle();

     //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement webElementText=driver.findElement(By.tagName("h3"));
        String expectedResult="Opening a new window";
        String actualText=webElementText.getText();
        Assert.assertEquals(expectedResult,actualText);
     //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String titel=driver.getTitle();
        String expectedTitel="The Internet";
        Assert.assertEquals(expectedTitel,titel);
     //● Click Here butonuna basın.
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
     //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        Set<String> windowhandles=driver.getWindowHandles();
        System.out.println(windowhandles);
        String zweiterWindowhandelWert="";
        for (String each: windowhandles
             ) {
            if (!each.contains(ersterWindowHandleWert))
            zweiterWindowhandelWert=each;
        }
        System.out.println(zweiterWindowhandelWert);
        driver.switchTo().window(zweiterWindowhandelWert);
        String actualTitel=driver.getTitle();
        String expectedTitelNeuWindow="New Window";
        Assert.assertEquals(expectedTitelNeuWindow,actualTitel);

     //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        actualText= driver.findElement(By.xpath("//h3[.='New Window']")).getText();
        expectedResult="New Window";
        Assert.assertEquals(expectedResult,actualText);

     //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        driver.switchTo().window(ersterWindowHandleWert);
        actualTitel= driver.getTitle();
        expectedResult="The Internet";
        Assert.assertEquals(expectedResult,actualTitel);

    }

}
