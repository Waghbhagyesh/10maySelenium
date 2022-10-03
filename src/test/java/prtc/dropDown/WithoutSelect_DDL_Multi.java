package prtc.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutSelect_DDL_Multi {
static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","G:\\Workspace_Selenium\\Selenium_May\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//*[text()='Select Option']")).click();
		driver.findElement(By.xpath("//li[text()='2 Rooms, 4 Adults']")).click();

		
	}
}
