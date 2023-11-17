package interviewpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.cssSelector("input[id = 'gender-male']")).click();
		driver.findElement(By.xpath("//input[@class = 'text-box single-line']")).sendKeys("Korepu"+Keys.TAB+"PavanKalyan"+Keys.TAB+"pavankorepu@gmail.com"+Keys.TAB+"sravya2830"+Keys.TAB+"sravya2830");
		WebElement Register = driver.findElement(By.xpath("//input[@name = 'register-button']"));
		Register.click();
		if(Register.isDisplayed()) {
			System.out.println("registration is sucessful");
		}
		else {
			System.out.println("registration is not completed");
			
		}
		driver.close();
		
		
		
		

	}

}
