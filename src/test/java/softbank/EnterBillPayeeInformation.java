package softbank;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterBillPayeeInformation {

    @Test
    public void test8(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\parabankCom\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/billpay.htm");
        String title = driver.getTitle();

        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.sendKeys("BabuNepal");

        WebElement passwordNameField = driver.findElement(By.name("password"));
        passwordNameField.sendKeys("subrat123");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();

        WebElement clickBillPay = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a"));
        clickBillPay.click();

        WebElement EnterPayeeName = driver.findElement(By.name("payee.name"));
        EnterPayeeName.sendKeys("James Bond");
        System.out.println("Payee Name enterned.");

        WebElement EnterPayeeaddress = driver.findElement(By.name("payee.address.street"));
        EnterPayeeaddress.sendKeys("7918 Ave. St.");
        System.out.println("Payee address enterned.");

        WebElement EnterPayeeCity = driver.findElement(By.name("payee.address.city"));
        EnterPayeeCity.sendKeys("Elmhurst");
        System.out.println("Payee city enterned.");

        WebElement EnterPayeeState = driver.findElement(By.name("payee.address.state"));
        EnterPayeeState.sendKeys("NY");
        System.out.println("Payee State enterned.");

        WebElement EnterPayeezipCode = driver.findElement(By.name("payee.address.zipCode"));
        EnterPayeezipCode.sendKeys("11373");
        System.out.println("Payee ZipCode enterned.");

        WebElement EnterPayeePhone = driver.findElement(By.name("payee.phoneNumber"));
        EnterPayeePhone.sendKeys("191-911-0910");
        System.out.println("Payee phone no. enterned.");

        WebElement EnterPayeeAccNo = driver.findElement(By.name("payee.accountNumber"));
        EnterPayeeAccNo.sendKeys("10720");
        System.out.println("Payee account no. enterned.");

        WebElement EnterPayAccVerify = driver.findElement(By.name("verifyAccount"));
        EnterPayAccVerify.sendKeys("10720");
        System.out.println("Payee account verified no. enterned.");

        WebElement EnterAmount = driver.findElement(By.name("amount"));
        EnterAmount.sendKeys("10000");
        System.out.println("Payee enterned amount.");

        WebElement AmountAccId = driver.findElement(By.name("fromAccountId"));
        AmountAccId.sendKeys("19116");
        System.out.println("Payee enterned account no..");

        WebElement sendPaymentClick = driver.findElement(By.className("button"));
        sendPaymentClick.click();



    }


}
