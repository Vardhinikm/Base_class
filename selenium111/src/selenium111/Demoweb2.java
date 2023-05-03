package selenium111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoweb2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software11/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[href=\'/login\']")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("Email")).sendKeys("vardhini@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.id("Password")).sendKeys("vardhini@123");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@type=\'submit\' and @value=\'Log in\']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class = \"header-menu\"]/ul[1]/li[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Cell phones\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[.=\"Used phone\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[.=\"Add your review\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@class=\"review-title\"]")).sendKeys("Vardh");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//textarea[@class=\"review-text\"]")).sendKeys("bad");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@data-val=\"true\"]")).click();
		Thread.sleep(1500);
		

	}

}
