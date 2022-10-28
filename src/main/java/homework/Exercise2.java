
package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://demowebshop.tricentis.com/login");
        driver.navigate().refresh();
        driver.close();

    }
}
