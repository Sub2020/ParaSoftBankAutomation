package softbank;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Secondtitle {
    WebDriver driver;

    @Test
    public void test3() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\parabankCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/news.htm#6");
        String title = driver.getTitle();

        Assert.assertEquals("ParaBank | News", title);
        String Title = driver.getTitle();
        System.out.println("Login second Page tile: " + title);


    }
}
