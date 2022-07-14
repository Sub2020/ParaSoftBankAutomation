package softbank;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {

    @Test
    public void test18(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\parabankCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        String title = driver.getTitle();

        Assert.assertEquals("ParaBank | Welcome | Online Banking", title);
        String Title = driver.getTitle();
        System.out.println("Login Page tile: " + title);

        WebElement homeclick = driver.findElement(By.linkText("contact"));
        homeclick.click();
        System.out.println("clicked on Contact button success.");
    }


}
