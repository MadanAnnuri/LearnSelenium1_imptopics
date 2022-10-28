package testngprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
    @Test
    public void startApp(){
        System.out.println("app started");
    }

    @Test
    public void loginApp(){
        System.out.println("Login");
    }
    @Test
    public  void logout(){
        System.out.println("Logout");
    }
}

