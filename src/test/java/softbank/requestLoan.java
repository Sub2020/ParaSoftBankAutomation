package softbank;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class requestLoan {

    @Test
    public void test11() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\parabankCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        String title = driver.getTitle();

        Assert.assertEquals("ParaBank | Welcome | Online Banking", title);
        String Title = driver.getTitle();
        System.out.println("Login Page tile: " + title);

        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.sendKeys("BabuNepal");

        WebElement passwordNameField = driver.findElement(By.name("password"));
        passwordNameField.sendKeys("subrat123");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();

        WebElement ClickRequestLoan = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a"));
        ClickRequestLoan.click();

        WebElement EnterLoanAmount = driver.findElement(By.xpath("//*[@id=\"amount\"]"));
        EnterLoanAmount.sendKeys("1000000");
        System.out.println("Loan amount entered.");

        WebElement EnterDownpayment = driver.findElement(By.xpath("//*[@id=\"downPayment\"]"));
        EnterDownpayment.sendKeys("500000");
        System.out.println("Account no. entered.");

        WebElement LoanAccount = driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]"));
        LoanAccount.sendKeys("19227");
        System.out.println("Down payment loan amount entered.");

        WebElement ClickSendLoan = driver.findElement(By.className("button"));
        ClickSendLoan.click();
        System.out.println("Click on loan button success.");


    }
}


