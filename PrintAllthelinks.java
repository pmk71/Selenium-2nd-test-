package SecondTest;
//WAS to print all the links text present in the given website
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllthelinks {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement> link = driver.findElements(By.tagName("a"));
int count=link.size();
for(WebElement l:link)
{
	String text = l.getText();
	System.out.println(text);
}
System.out.println(count);
driver.quit();
	}

}
