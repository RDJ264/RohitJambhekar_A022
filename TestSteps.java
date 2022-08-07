package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		String projectpath=System.getProperty("user.dir");
		System.out.println("Project path is"+projectpath);
	    System.out.println("Browser is open");
	    System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver.exe");
	    this.driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@And("user clicks on respective product categories")
	public void user_is_on_google_search_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Google search page open");
		this.driver.navigate().to("https://www.demoblaze.com/index.html");
	}

	@When("User clicks on bext and previous buttons")
	public void user_clicks_on_bext_and_previous_buttons() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		this.driver.findElement(By.id("next2")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.id("prev2")).click();
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		this.driver.findElement(By.linkText("Phones")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.linkText("Monitors")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.linkText("Apple monitor 24")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.linkText("Add to cart")).click();
		this.driver.findElement(By.className("nav-link")).click();
		this.driver.findElement(By.linkText("Samsung galaxy s6")).click();
		this.driver.findElement(By.linkText("Add to cart")).click();
		this.driver.findElement(By.className("nav-link")).click();
		this.driver.findElement(By.linkText("Samsung galaxy s6")).click();
		this.driver.findElement(By.linkText("Add to cart")).click();
		this.driver.findElement(By.id("cartur")).click();
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.findElement(By.id("name")).sendKeys("Rohit Dhanesh Jambhekar");
		driver.findElement(By.id("card")).sendKeys("1001010101");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick='purchaseOrder()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".confirm.btn.btn-lg.btn-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout2")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.id("cartur")).click();
		this.driver.findElement(By.cssSelector(".btn.btn-success")).click();
		this.driver.findElement(By.cssSelector("button[onclick='purchaseOrder()']")).click();
		this.driver.findElement(By.cssSelector(".confirm.btn.btn-lg.btn-primary")).click();
	}

	@Then("Products are displayed to the user")
	public void products_are_displayed_to_the_user() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("products are displayed")
	public void products_are_displayed() throws InterruptedException {
	}

	@And("user clicks on respective product links")
	public void user_clicks_on_respective_product_links() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on respective product links");
	}

	@Then("product details are displayed")
	public void product_details_are_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("click on add to cart button")
	public void click_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on add to cart button");
	}

	@Then("click on cart button on navigation bar")
	public void click_on_cart_button_on_navigation_bar() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on add to cart button on nav bar");
	}

	@Given("Click on home page")
	public void click_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Home Page");
	}

	@And("click on add to cart of same product")
	public void click_on_add_to_cart_of_same_product() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("click on cart button of navigation page")
	public void click_on_cart_button_of_navigation_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@And("click on delete button of respective product")
	public void click_on_delete_button_of_respective_product() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("product is deleted")
	public void product_is_deleted() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");	}

	@Given("click on link of a unique product")
	public void click_on_link_of_a_unique_product() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@And("click on cart button")
	public void click_on_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("Total price is updated")
	public void total_price_is_updated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("Click on Cart button on navigation bar")
	public void click_on_Cart_button_on_navigation_bar() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("Click on Home page")
	public void click_on_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("Click on logout button")
	public void click_on_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@And("login using valid credentials")
	public void login_using_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("Click on Cart")
	public void click_on_Cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("delete all the products of cart")
	public void delete_all_the_products_of_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@And("click on Place order button")
	public void click_on_Place_order_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@And("fill in the details of textfields")
	public void fill_in_the_details_of_textfields() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("Purchase product")
	public void purchase_product() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("Click on Cart button of navigation page")
	public void click_on_Cart_button_of_navigation_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@And("click on purchase button")
	public void click_on_purchase_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("fill the details and enter invalid credit card number")
	public void fill_the_details_and_enter_invalid_credit_card_number() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("click on purchase")
	public void click_on_purchase() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("fill only name and credit card number textfields")
	public void fill_only_name_and_credit_card_number_textfields() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("click purchase")
	public void click_purchase() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Given("Click Purchase again")
	public void click_Purchase_again() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}

	@Then("click on Okay button after popup modal is displayed")
	public void click_on_Okay_button_after_popup_modal_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Add to cart if same page");
	}



}
