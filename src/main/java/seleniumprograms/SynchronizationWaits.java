package seleniumprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SynchronizationWaits {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Thread.sleep(Long.parseLong("3000"));
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

       /* WebDriverWait waituser=new WebDriverWait(driver, Duration.ofSeconds(5));
        waituser.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));*/
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

    }
}
