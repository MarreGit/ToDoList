package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    private WebDriver driver;
    @Given("I have a list")
    public void iHaveAList() {
    }

    @When("I want to add a new task with description {string}")
    public void iWantToAddANewTaskWithDescription(String arg0) {
    }

    @Then("Task {string} will be added to list")
    public void taskWillBeAddedToList(String arg0) {
    }

    @Given("I have added a task with description {string}")
    public void iHaveAddedATaskWithDescription(String arg0) {
    }

    @When("I check the task")
    public void iCheckTheTask() {
    }

    @Then("the task {string} is checked")
    public void theTaskIsChecked(String arg0) {
    }

    @Given("I am using {string} browser")
    public void iAmUsingBrowser(String browser) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.findElement(By.name("q")).sendKeys("Hello");
        Thread.sleep(5000);
        driver.quit();
    }

}
