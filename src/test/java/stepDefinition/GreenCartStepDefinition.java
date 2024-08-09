package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class GreenCartStepDefinition {
    public WebDriver driver;
    public String productNameSearch;


    @Given("User is on GreenCart login page")
    public void user_is_on_green_cart_login_page() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("User search with short name with {string} amd extracted actual name of the product")
    public void user_search_with_short_name_with_amd_extracted_actual_name_of_the_product(String shortname) throws InterruptedException {
        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys(shortname);
        productNameSearch = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        Thread.sleep(2000);
        System.out.println(productNameSearch + " is extracted from the home page");
    }

    @Then("User searched the for the {string} shortname in offers page to check if product exist")
    public void user_searched_the_for_the_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws InterruptedException {
        driver.findElement(By.linkText("Top Deals")).click();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();

        driver.switchTo().window(childWindow);

        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys(shortname);
        Thread.sleep(2000);
        String productNameOffer = driver.findElement(By.cssSelector("tr td:nth-child(5)")).getText();
        System.out.println(productNameOffer + " is extracted from the offers page");

        // Assert that the product name on the offers page matches the one on the home page
        Assert.assertEquals(productNameOffer, productNameSearch);

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
    }
}
