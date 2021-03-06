//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//
//	@Given("^Users is already present on Login Page$")
//	public void user_login_page() {
//		System.setProperty("webdriver.chrome.driver", "/Users/suman/Desktop/chromedriver");
//
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//
//	}
//
//	@When("^Title of Login Page is Flipkart Login$")
//	public void title_login_page() {
//          String title = driver.getTitle();
//          System.out.println(title);
//          Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", title);
//		
//	}
////	
////	@Then("^User enters username and password$")
////	public void enter_uname_pswrd() throws InterruptedException {
////	 Thread.sleep(1000);
////	 driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8700473576");
////	 driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Suman@13");
////		
////	}
//	
//	@Then("^User enters \"(.*)\" and \"(.*)\"$")
//	public void enter_uname_pswrd(String username, String password) throws InterruptedException {
//	 Thread.sleep(1000);
//	 driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(username);
//	 driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys(password);
//		
//	}
//	@Then("^User clicks on Login Button$") 
//	public void click_on_login_btn() {
//		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
//	}
//	
//	@Then("^User is in Home Page$")
//	public void user_is_in_home_page(){
//		String hometitle =driver.getTitle();
//		System.out.println("Home Page title is :" +hometitle);
//		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", hometitle);
//		
//	}
//	@Then("^user adds \"(.*)\"")
//	public void users_adds_painting_and_watches(String painting) throws InterruptedException {
//		 Thread.sleep(1000);
//		 driver.findElement(By.name("q")).sendKeys(painting);
//		 
//		
//	
//	}
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
