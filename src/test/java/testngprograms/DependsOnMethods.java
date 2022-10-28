package testngprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {

    @Test(priority = 0,description = "app started")
    public void startApp(){
        System.out.println("appStarted");
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        String expectedResult ="Demo Web Shop. Login";
        String actualResult =driver.getTitle();
        System.out.println(actualResult);
        if(actualResult.equals(expectedResult)) {
            System.out.println("you are at correct login page");
        }

    }
    @Test
    public void loginApp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        System.out.println("Login");
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("madanannuri@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("madan@118");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
    }

    @Test(priority = 2,description ="logout successfull" )
    public  void logout(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.close();
        System.out.println("Logout");
    }
}
