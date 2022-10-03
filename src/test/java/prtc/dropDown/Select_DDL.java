package prtc.dropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DDL {
static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","G:\\Workspace_Selenium\\Selenium_May\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement ddl=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(ddl);
	   
		System.out.println(sel.getFirstSelectedOption().getText());
		//sel.selectByVisibleText("INDIA");
		
	}
}
