package saucedemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
    WebDriver Driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("Halaman login saucedemo")
    public void halamanloginsaucedemo()
    {
        WebDriverManager.firefoxdriver().setup();
        Driver = new FirefoxDriver();
        Driver.get(baseUrl);
    }

    @When("Input username")
    public void input_username()
    {
        Driver.findElement(By.name("user-name")).sendKeys("visual_user");
    }

    @And("Input password")
    public void input_password()
    {
        Driver.findElement(By.name("password")).sendKeys("secret_sauce");
    }

    @And("Click login button")
    public void click_login_button() {
        Driver.findElement(By.id("login-button")).click();
    }

    @Then("User direct to Dashboard Page")
    public void userdirecttodashboardpage() {
    }

    @And("Input Invalid password")
    public void input_invalid_password() {
        Driver.findElement(By.id("password")).sendKeys("secret_caebe");
    }

    @Then("User get error message")
    public void user_get_error_message() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service","Epic sadface: Username and password do not match any user in this service");
    }

}
