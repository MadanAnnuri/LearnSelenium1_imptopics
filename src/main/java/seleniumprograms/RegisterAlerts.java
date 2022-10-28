package seleniumprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

        Alert alt=driver.switchTo().alert();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();
        /*String alertMessage =driver.switchTo().alert().getText();
        System.out.println(alertMessage);*/
        //Thread.sleep(3000);
        alt.accept();


        //driver.close();
    }
}
