package softbank;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankNews {


    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\parabankCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        String title = driver.getTitle();

        WebElement latsnewsfield = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a"));
        latsnewsfield.click();

    }
}

