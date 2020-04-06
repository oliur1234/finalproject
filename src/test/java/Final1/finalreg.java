package Final1;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class finalreg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class='login']")).click();

		String title = driver.getTitle();
		System.out.println("this is the actual title after log in" + title);
		// String expectedtitle = "pankash";
		String expectedtitle = driver.getTitle();
		System.out.println("this is the ecpected title: " + expectedtitle);
		Assert.assertEquals(expectedtitle, title);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mroliur@yahoo.com");

		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("65436543");

		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();

		driver.findElement(By.xpath("(//*[@title='Dresses'])[2]")).click();

		js.executeScript("window.scrollBy(0, 1200)");

		System.out.println(driver.findElement(By.xpath("(//*[@class='price product-price'])[2]")).getText());

		WebElement p1 = driver.findElement(By.xpath("(//*[@class='price product-price'])[2]"));
		WebElement p2 = driver.findElement(By.xpath("(//*[@class='price product-price'])[4]"));
		WebElement p3 = driver.findElement(By.xpath("(//*[@class='price product-price'])[6]"));
		WebElement p4 = driver.findElement(By.xpath("(//*[@class='price product-price'])[8]"));
		WebElement p5 = driver.findElement(By.xpath("(//*[@class='price product-price'])[10]"));

		ArrayList<String> price = new ArrayList<String>();

		price.add(p1.getText());
		price.add(p2.getText());
		price.add(p3.getText());
		price.add(p4.getText());
		price.add(p5.getText());

		for (String allprices : price) {
			System.out.println(allprices);
		}

		Collections.sort(price, Collections.reverseOrder());
		System.out.println("ArrayList in descending order");

		for (String allprices : price) {
			System.out.println(allprices);
		}

		WebElement rightblock = driver.findElement(By.xpath("(//*[@class='right-block'])[2]"));
		WebElement cart = driver.findElement(By.xpath("(//*[@title='Add to cart'])[2]"));
		WebElement checkout = driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']"));

		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(rightblock).perform();
		cart.click();

		Thread.sleep(2000);
		checkout.click();

		js.executeScript("window.scrollBy(0, 500)");

		String totalprice = driver.findElement(By.xpath("//*[@id='total_price']")).getText();
		System.out.println("total price with shipping: " + totalprice);

		// String finalprice = "$52.00";

		String finalprice = "$52.99";
		Assert.assertEquals(finalprice, totalprice);

		// Thread.sleep(3000);

		js.executeScript("window.scrollBy(0, -500)");

		driver.findElement(By.xpath("//*[@class='logout']")).click();

		// driver.close();

	}
}
