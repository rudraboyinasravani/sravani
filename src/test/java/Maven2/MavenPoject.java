package Maven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenPoject {
	@Test
	public void method1() {
		//System.setProperty("webdriver.chrome.driver", "D:\\sravani\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void method2() {
		//System.setProperty("webdriver.chrome.driver", "D:\\sravani\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}

}
