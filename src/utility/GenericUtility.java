package utility;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericUtility {
	
	WebDriver driver;

	public static void main(String[] args) {
		
		System.out.println("This is the git project only");

	}
	
	@Test
	public void printName()
	{
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
	}

}
