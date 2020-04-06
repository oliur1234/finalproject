package Pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FinalPF {
	WebDriver driver3;

	public FinalPF(WebDriver driver) {
		this.driver3 = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@class='login']")
	private WebElement loginb;

	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id='passwd']")
	private WebElement pass;

	@FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
	private WebElement signin;

	@FindBy(how = How.XPATH, using = "(//*[@class='sf-with-ul'])[4]")
	private WebElement dress;

	@FindBy(how = How.XPATH, using = "//*[@itemprop='price']")
	private WebElement pricevalues;

	@FindBy(how = How.XPATH, using = "(//*[@class='price product-price'])[2]")
	private WebElement p1;

	@FindBy(how = How.XPATH, using = "(//*[@class='price product-price'])[4]")
	private WebElement p2;

	@FindBy(how = How.XPATH, using = "(//*[@class='price product-price'])[6]")
	private WebElement p3;

	@FindBy(how = How.XPATH, using = "(//*[@class='price product-price'])[8]")
	private WebElement p4;

	@FindBy(how = How.XPATH, using = "(//*[@class='price product-price'])[10]")
	private WebElement p5;

	@FindBy(how = How.XPATH, using = "(//*[@class='right-block'])[2]")
	private WebElement dresssecond;

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Add to cart')])[2]")
	private WebElement cart;

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-default button button-medium']")
	private WebElement proceed;

	@FindBy(how = How.XPATH, using = "//*[@id='total_price']")
	private WebElement verifytotalprice;

	@FindBy(how = How.XPATH, using = "//*[@class='logout']")
	private WebElement logout;

	public WebElement getLoginb() {
		return loginb;
	}

	public void setLoginb(WebElement loginb) {
		this.loginb = loginb;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

	public WebElement getDress() {
		return dress;
	}

	public void setDress(WebElement dress) {
		this.dress = dress;
	}

	public WebElement getPricevalues() {
		return pricevalues;
	}

	public void setPricevalues(WebElement pricevalues) {
		this.pricevalues = pricevalues;
	}

	public WebElement getP1() {
		return p1;
	}

	public void setP1(WebElement p1) {
		this.p1 = p1;
	}

	public WebElement getP2() {
		return p2;
	}

	public void setP2(WebElement p2) {
		this.p2 = p2;
	}

	public WebElement getP3() {
		return p3;
	}

	public void setP3(WebElement p3) {
		this.p3 = p3;
	}

	public WebElement getP4() {
		return p4;
	}

	public void setP4(WebElement p4) {
		this.p4 = p4;
	}

	public WebElement getP5() {
		return p5;
	}

	public void setP5(WebElement p5) {
		this.p5 = p5;
	}

	public WebElement getDresssecond() {
		return dresssecond;
	}

	public void setDresssecond(WebElement dresssecond) {
		this.dresssecond = dresssecond;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public void setProceed(WebElement proceed) {
		this.proceed = proceed;
	}

	public WebElement getVerifytotalprice() {
		return verifytotalprice;
	}

	public void setVerifytotalprice(WebElement verifytotalprice) {
		this.verifytotalprice = verifytotalprice;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

}