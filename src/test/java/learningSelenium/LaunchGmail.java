package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://practicetestautomation.com/practice-test-login/");

	        // Maximize browser window
	        driver.manage().window().maximize();

	        // Find and fill in the username field
	        WebElement username = driver.findElement(By.id("username"));
	        username.sendKeys("student");

	        // Find and fill in the password field
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("Password123");

	        // Click the login button
	        WebElement loginButton = driver.findElement(By.id("submit"));
	        loginButton.click();
	        
	        //To get the url of current web page
	        String url = driver.getCurrentUrl();
	        System.out.println("URL: "+url);

	        // Check if login was successful by confirming the URL or element
	        if (url.equals("https://practicetestautomation.com/logged-in-successfully/"))
	        {
	        	System.out.println("u r Login");
	        	} 
	        else 
	        {
	        	System.out.println("Login Failed");
	        	}
	        Thread.sleep(3000);

	        // Close the browser
	        driver.quit();
	    }
	}


