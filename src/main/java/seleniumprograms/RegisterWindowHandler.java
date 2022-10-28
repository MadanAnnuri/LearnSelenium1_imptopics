package seleniumprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.dvcs.DVCSRequestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class RegisterWindowHandler {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Windows.html");

        driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();

        Set<String>windowid= driver.getWindowHandles();
        Iterator<String>itr=windowid.iterator();

        String mainwindow=itr.next();
        String childwindow=itr.next();

        String main =driver.switchTo().window(mainwindow).getTitle();
        System.out.println(main);

        String child =driver.switchTo().window(childwindow).getTitle();
        System.out.println(child);
       // driver.close();

        String main1 =driver.switchTo().window(mainwindow).getTitle();
        System.out.println(main1);

        driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
        //driver.quit();
    }
}
