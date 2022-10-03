package prtc.windowhandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandle {
static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","G:\\Workspace_Selenium\\Selenium_May\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		String ParentWi=driver.getWindowHandle();
		System.out.println(ParentWi);
		driver.switchTo().window(ParentWi);
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		System.out.println(ele);
	
		
	}
}
