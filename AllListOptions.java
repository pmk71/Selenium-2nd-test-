package SecondTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllListOptions {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement op = driver.findElement(By.id("course"));
Select s= new Select(op);
List<WebElement> option = s.getOptions();
int count=option.size();

for (int i = 0; i <count; i++) {
	String text = option.get(i).getText();
	System.out.println(text);
}

driver.close();
	}

}
