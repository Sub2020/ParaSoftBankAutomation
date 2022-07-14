package softbank;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upDateInfo {

    @Test
    public void test10(){
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
        System.out.println("Username entered");

        WebElement passwordNameField = driver.findElement(By.name("password"));
        passwordNameField.sendKeys("subrat123");
        System.out.println("password entered");

        WebElement clickLogIn = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        clickLogIn.click();
        System.out.println("Login Success!!");

        WebElement ClickUpdateInfo = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a"));
        ClickUpdateInfo.click();
        System.out.println("Click on Update Contact Info success.");

        WebElement CustomerFirstName = driver.findElement(By.name("customer.firstName"));
        CustomerFirstName.sendKeys("James");
        System.out.println("Customer entered first name.");

        WebElement CustomerlastName = driver.findElement(By.name("customer.lastName"));
        CustomerlastName.sendKeys("Bond");
        System.out.println("Customer entered last name.");

        WebElement CustomerAddress = driver.findElement(By.name("customer.address.street"));
        CustomerAddress.sendKeys("7918 woodside");
        System.out.println("Customer entered street address.");

        WebElement CustomerAddressCity = driver.findElement(By.name("customer.address.city"));
        CustomerAddressCity.sendKeys("Elmhurst");
        System.out.println("Customer entered  city.");

        WebElement CustomerState = driver.findElement(By.name("customer.address.state"));
        CustomerState.sendKeys("NY");
        System.out.println("Customer entered State.");

        WebElement CustomerzipCode = driver.findElement(By.name("customer.address.zipCode"));
        CustomerzipCode.sendKeys("11373");
        System.out.println("Customer entered zipCode.");

        WebElement CustomerPhoneNo = driver.findElement(By.name("customer.phoneNumber"));
        CustomerPhoneNo.sendKeys("911-123-4567");
        System.out.println("Customer entered phone #.");



        WebElement ClickOnUpdate = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[8]/td[2]/input"));
        ClickOnUpdate.click();




    }
}
