package saucedemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("Halaman login saucedemo")
    public void halaman_login_saucedemo(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
        throw new io.cucumber.java.PendingException();

    }

    @When("Input username")
    public void inputUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("Input password")
    public void inputPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("Click login button")
    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User direct to Dashboard Page")
    public void userDirectToDashboardPage() {
    }

    @And("Input Invalid password")
    public void inputInvalidPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_caebe");
    }

    @Then("User get error message")
    public void userGetErrorMessage() {
//        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service","Epic sadface: Username and password do not match any user in this service");
    }
}
