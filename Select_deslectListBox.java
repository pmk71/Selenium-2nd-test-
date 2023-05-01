package SecondTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_deslectListBox {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

// single drop down
WebElement sl = driver.findElement(By.id("course"));
Select s= new Select(sl);
s.selectByIndex(4);
Thread.sleep(2000);
s.selectByValue("java");
Thread.sleep(2000);
s.selectByVisibleText("Dot Net");
Thread.sleep(2000);
System.out.println(s.getFirstSelectedOption());

//multi select text box

WebElement ml = driver.findElement(By.id("ide"));
Select s1= new Select(ml);
s1.selectByIndex(1);
Thread.sleep(2000);
s1.selectByValue("ij");
Thread.sleep(2000);
s1.selectByVisibleText("Visual Studio");
Thread.sleep(2000);
s1.deselectAll();
Thread.sleep(2000);
System.out.println(s1.isMultiple());
driver.quit();
	}

}
