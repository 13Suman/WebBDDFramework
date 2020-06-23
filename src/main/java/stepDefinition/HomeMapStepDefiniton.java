package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeMapStepDefiniton {

	WebDriver driver;

	@Given("^Users is already present on Login Page$")
	public void user_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/suman/Desktop/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

	@When("^Title of Login Page is Flipkart Login$")
	public void title_login_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",
				title);

	}

	@Then("^User enters username and password$")
	public void enter_uname_pswrd(DataTable credentials) throws InterruptedException {
		Thread.sleep(1000);
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)){
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys(data.get("password"));
		}
	}

	@Then("^User clicks on Login Button$")
	public void click_on_login_btn() {
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	}

	@Then("^User is in Home Page$")
	public void user_is_in_home_page() {
		String hometitle = driver.getTitle();
		System.out.println("Home Page title is :" + hometitle);
		Assert.assertEquals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",
				hometitle);

	}


	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
	
	
	
	
}
