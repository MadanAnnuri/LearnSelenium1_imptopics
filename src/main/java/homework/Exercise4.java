package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/login");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for(WebElement link:allLinks){
            System.out.println(link.getText() );
        }

    }
}
