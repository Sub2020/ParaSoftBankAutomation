package softbank;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class billPay {

    @Test
    public void test7(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\parabankCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/news.htm#6");
        String title = driver.getTitle();

        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.sendKeys("BabuNepal");
        System.out.println("Username entered");

        WebElement passwordNameField = driver.findElement(By.name("password"));
        passwordNameField.sendKeys("subrat123");
        System.out.println("password entered");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();
        System.out.println("Login Success!!");

        WebElement clickBillPay = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a"));
        clickBillPay.click();
        System.out.println("Click on Bill Pay success!!");
    }
}
