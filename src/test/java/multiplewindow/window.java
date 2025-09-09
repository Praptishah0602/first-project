package multiplewindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(5000);
		 //get window handel-return id of single browser window
		 String windowid= driver.getWindowHandle();
		 System.out.println("window id:" + windowid);
		 //get windowhandles -return id of multiple browser windows
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 Set<String> windowids= driver.getWindowHandles(); // all ds are in string format,windowids are unique-set collection doesnt allow duplicates
		 System.out.println("windowids: "+ windowids);
	}

}
