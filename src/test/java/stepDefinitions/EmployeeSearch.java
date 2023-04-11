package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class EmployeeSearch extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimBtn=driver.findElement(By.id("menu_pim_viewPimModule"));
        doClick(pimBtn);
    }
    @When("user enters valid employee Id")
    public void user_enters_valid_employee_id() {
        WebElement empId= driver.findElement(By.id("empsearch_id"));
        sendText(empId, ConfigReader.getPropertyValue("employeeId"));
    }
    @When("user selects job title")
    public void user_selects_job_title() {
        WebElement jobTitle= driver.findElement(By.id("empsearch_job_title"));
        selectByOptions(jobTitle,"Singer");

        WebElement empStatus= driver.findElement(By.id("empsearch_employee_status"));
        selectByOptions(empStatus,"Active");

        WebElement subUnit= driver.findElement(By.id("empsearch_sub_unit"));
        selectByOptions(subUnit,"Test");

        WebElement inc= driver.findElement(By.id("empsearch_termination"));
        selectByOptions(inc,"Current and Past Employees");
    }
    @When("clicks on search button")
    public void clicks_on_search_button() {
        WebElement searchBtn= driver.findElement(By.id("searchBtn"));
        doClick(searchBtn);
    }
    @When("user sees employee information displayed")
    public void user_sees_employee_information_displayed() {
        System.out.println("successful");
    }

}
