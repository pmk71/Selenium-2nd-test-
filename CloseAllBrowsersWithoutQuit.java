package SecondTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowsersWithoutQuit {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("newWindowBtn")).click();
Set<String> wh = driver.getWindowHandles();
for(String w:wh)
{
driver.switchTo().window(w);
driver.close();
}
	}

}
