package variouspackage;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnlocators {

	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void learnLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Neelam");
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\khare\\OneDrive\\Desktop\\seli 1.txt");
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	}
}
