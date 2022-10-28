package seleniumprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RigisterIFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement frame1= driver. findElement(By.xpath("//iframe[@id='singleframe']"));
         driver.switchTo().frame(frame1);
         driver. findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
         driver.switchTo().defaultContent();

         driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
         driver.switchTo().frame(1);
         driver.switchTo().frame(0);
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WebDriver");
         driver.switchTo().defaultContent();
         driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();






    }
}
