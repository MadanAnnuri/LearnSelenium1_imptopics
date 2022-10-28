package seleniumprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class KeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");

        Actions act =new Actions(driver);
        //Thread.sleep(3000);
        act.sendKeys(Keys.ENTER).perform();




    }
}
