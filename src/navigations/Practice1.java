package navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * scenario:
 * open the browser
 * enter google.com
 * navigate back
 * close the browser
 */
public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https;//www.google.com/");
      Thread.sleep(10000);
      driver.navigate().back();
      Thread.sleep(10000);
      
      driver.close();
	}
 
}
