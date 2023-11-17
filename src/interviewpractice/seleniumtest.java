package interviewpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class seleniumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.partialLinkText("COMPUTERS"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		driver.findElement(By.partialLinkText("Desktops")).click();
		String title =driver.getTitle();
		System.out.println(title);
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select s = new Select(dropdown);
		if(s.isMultiple()) {
			System.out.println("dropdown is multiselect");
		}
		else {
			System.out.println("dropdown is singleselect");
			s.selectByIndex(0);
		}
		
		
		}
		
			
		
		
		

	}


