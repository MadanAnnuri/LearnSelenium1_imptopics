package seleniumprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginpageOrangeHrm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String ExpectedPage=driver.getTitle();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
        String ActualPage =driver.getTitle();
        if(ExpectedPage.equals(ActualPage)){
            System.out.println("login page was redirected succsessfully after logout");
        }
        driver.close();
    }
}
