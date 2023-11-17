package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classnamepractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.className("x4bK8")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("_381fS")).sendKeys("6281580287");
		Thread.sleep(10000);
		driver.findElement(By.className("a-ayg")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
