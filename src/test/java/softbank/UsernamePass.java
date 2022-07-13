package softbank;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class UsernamePass {

    @Test
    public void test4(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\parabankCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/news.htm#6");
        String title = driver.getTitle();

        WebElement nameField = driver.findElement(By.name("username"));
        boolean nameFieldDisplayed = nameField.isDisplayed();
        System.out.printf("Check if UserName field is displayed: %s%n", nameFieldDisplayed);
        assertTrue(nameFieldDisplayed);

        WebElement passwordField = driver.findElement(By.name("password"));
        boolean passwordFieldIsDisplayed = passwordField.isDisplayed();
        System.out.println("Check if password field is displayed: " + passwordFieldIsDisplayed);
        assertTrue(passwordFieldIsDisplayed);

        WebElement loginPanell = driver.findElement(By.id("loginPanel"));
        boolean loginPanellIsDisplayed = loginPanell.isDisplayed();
        System.out.println("Check if Login Button field is displayed: " + loginPanellIsDisplayed);
        assertTrue(loginPanellIsDisplayed);
    }
}
