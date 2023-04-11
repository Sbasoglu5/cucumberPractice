package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.CommonMethods;
import utils.ConfigReader;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Login extends CommonMethods {

    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        WebElement usernameBox=driver.findElement(By.id("txtUsername"));
        sendText(usernameBox,ConfigReader.getPropertyValue("username"));
        WebElement passBox=driver.findElement(By.id("txtPassword"));
        sendText(passBox,ConfigReader.getPropertyValue("password"));
    }
    @When("click on login button")
    public void click_on_login_button() {
        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        doClick(loginBtn);
    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean displayed=driver.findElement(By.xpath("//a[text()='Welcome Admin']")).isDisplayed();
        if (displayed){
            System.out.println("successfully displayed");
        }
    }

    @When("user enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String username, String password) {
        WebElement usernameBox=driver.findElement(By.id("txtUsername"));
        sendText(usernameBox,username);
        WebElement passBox=driver.findElement(By.id("txtPassword"));
        sendText(passBox,password);
    }

}
