package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.dismiss();

        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alt1=driver.switchTo().alert();
       alt1.sendKeys("Madan");
       alt1.accept();
    }
}
