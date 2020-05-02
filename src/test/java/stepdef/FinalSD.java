package stepdef;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pagefactories.FinalPF;

public class FinalSD {
	static WebDriver driver;
	static FinalPF pf;
	static JavascriptExecutor js;
	static WebDriverWait explicit;
	static Actions action;

	@Given("^User go to the website$")
	public void user_go_to_the_website() throws Throwable {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		js = (JavascriptExecutor) driver;

		driver.get("http://automationpractice.com/index.php");

		pf = PageFactory.initElements(driver, FinalPF.class);

		action = new Actions(driver);

		explicit = new WebDriverWait(driver, 20);

		driver.manage().window().maximize();
	}

	@When("^User click on the log in button$")
	public void user_click_on_the_log_in_button() throws Throwable {
		pf.getLoginb().click();
	}

	@When("^User enter valid email address and password$")
	public void user_enter_valid_email_address_and_password() throws Throwable {
		pf.getEmail().sendKeys("mroliur@yahoo.com");
		pf.getPass().sendKeys("65436543");

	}

	@When("^User click on the submit button$")
	public void user_click_on_the_submit_button() throws Throwable {
		pf.getSignin().click();
	}

	@When("^User verify the  website title$")
	public void user_verify_the_website_title() throws Throwable {

		String title = "My account - My Store";
		System.out.println("this is the actual title after log in" + title);
		String expectedtitle = driver.getTitle();
		System.out.println("this is the ecpected title: " + expectedtitle);
		Assert.assertEquals(expectedtitle, title);
	}

	@Then("^User click on the dress button$")
	public void user_click_on_the_dress_button() throws Throwable {
		pf.getDress().click();
	}

	@Then("^User print all the prices values in decending order$")
	public void user_print_all_the_prices_values_in_decending_order() throws Throwable {

		js.executeScript("window.scrollBy(0, 900)");

		ArrayList<String> price = new ArrayList<String>();
		
	explicit.until(ExpectedConditions.visibilityOf(pf.getP1()));
		price.add(pf.getP1().getText());
		
	explicit.until(ExpectedConditions.visibilityOf(pf.getP2()));
		price.add(pf.getP2().getText());
		
	explicit.until(ExpectedConditions.visibilityOf(pf.getP3()));
		price.add(pf.getP3().getText());
		
	explicit.until(ExpectedConditions.visibilityOf(pf.getP4()));
		price.add(pf.getP4().getText());
		
	explicit.until(ExpectedConditions.visibilityOf(pf.getP5()));
		price.add(pf.getP5().getText());

		for (String allprices : price) {
			System.out.println(allprices);
		}

		Collections.sort(price, Collections.reverseOrder());
		System.out.println("ArrayList in descending order");

		for (String allprices : price) {
			System.out.println(allprices);
		}
	}

	@Then("^User select the second dress on that list$")
	public void user_select_the_second_dress_on_that_list() throws Throwable {
		
		explicit.until(ExpectedConditions.visibilityOf(pf.getDresssecond()));

		action.moveToElement(pf.getDresssecond()).perform();

	}

	@Then("^User click on the cart$")
	public void user_click_on_the_cart() throws Throwable {
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getCart()));

		pf.getCart().click();
	}

	@Then("^User click on proceed to checkout$")
	public void user_click_on_proceed_to_checkout() throws Throwable {
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getProceed()));
		action.moveToElement(pf.getProceed()).perform();
		pf.getProceed().click();

	}

	@Then("^User verify the total price with shipping$")
	public void user_verify_the_total_price_with_shipping() throws Throwable {
		js.executeScript("window.scrollTo(0, 500)");
// explicit could use
		String totalprice = pf.getVerifytotalprice().getText();

		System.out.println("verify total price : " + totalprice);

		String totalexpectedprice = "$52.99";

		Assert.assertEquals(totalexpectedprice, totalprice);
	}

	@Then("^User logout from the website$")
	public void user_logout_from_the_website() throws Throwable {
		js.executeScript("window.scrollTo(0, 0)");

		explicit.until(ExpectedConditions.elementToBeClickable(pf.getLogout()));

		pf.getLogout().click();

	}

	@Then("^User close the window$")
	public void user_close_the_window() throws Throwable {

		Thread.sleep(3000);
		driver.close();

	}

}
