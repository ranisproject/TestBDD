//package StepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    static WebDriver driver;

    @Given("Launch Chrome")
    public void launchChrome() {
        System.setProperty("webdriver.chrome.driver","/Users/sukanya/IdeaProjects/TestBDD/test/src/chromedriver");
        driver= new ChromeDriver();
    }
    @When("Click on One way")
    public void clickOnOneWay() {
        driver.get("https://www.aa.com/homePage.do");
        driver.findElement(By.xpath("//span[contains(text(),'One way')]")).click();
    }

    @Then("Click on round trip")
    public void clickOnRoundTrip() {
        driver.findElement(By.xpath("//span[contains(text(),'Round trip')]")).click();
    }
}
