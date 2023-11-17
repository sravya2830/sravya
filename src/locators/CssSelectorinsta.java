package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorinsta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("sravyagoudburra");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Sailugoud2830");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("button._acas")).click();
		 Thread.sleep(3000);
		 driver.close();
	}

}
