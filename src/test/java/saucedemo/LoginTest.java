package saucedemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver;

    @Test
    public void login() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\App\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        // Go to saucedemo login page
        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();

        // Fill username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("react-burger-menu-btn")).isDisplayed();
    }

}
