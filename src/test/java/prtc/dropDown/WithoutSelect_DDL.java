package prtc.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelect_DDL {
static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","G:\\Workspace_Selenium\\Selenium_May\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/hotels");
		driver.findElement(By.xpath("//button[@name='travellers']")).click();
		driver.findElement(By.xpath("//li[text()='2 Rooms, 4 Adults']")).click();

		
	}
}
