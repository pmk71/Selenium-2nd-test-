package SecondTest;
//WAS to capture all the auto suggestions
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutoSugeestions {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("java");
	List<WebElement> sug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count=sug.size();
	
	for(WebElement s:sug)
	{
		String text = s.getText();
		System.out.println(text);
	}
	System.out.println("the number of suggestions are:"+count);
	driver.quit();
}
}
