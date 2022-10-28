package seleniumprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginpage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        String expectedResult ="Demo Web Shop. Login";
        String actualResult =driver.getTitle();
        System.out.println(actualResult);
        if(actualResult.equals(expectedResult)) {
            System.out.println("you are at correct login page");
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("madanannuri@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("madan@118");
            driver.findElement(By.cssSelector("input[value='Log in']")).click();
        }
        else
        {
            System.out.println("you are at wrong page");
        }
        driver.close();

    }
}
