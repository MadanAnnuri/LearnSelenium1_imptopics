package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/login");

        String titleName=driver.getTitle();
        System.out.println("Title Name: " + titleName);
        System.out.println("Title Length: "+titleName.length());

        String PageURL=driver.getCurrentUrl();
        System.out.println("PageURL: "+PageURL);

        PageURL.compareTo("https://demowebshop.tricentis.com/login\"");

        System.out.println("pagelength"+driver.getPageSource().length());
        driver.close();

    }
}
