package SecondTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReaddataFromPropertyFile {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fs= new FileInputStream("./data/commondata.property");
	Properties p= new Properties();
	p.load(fs);
	 String url = p.getProperty("url");
	 String un = p.getProperty("username");
	 String pw = p.getProperty("password");
	 
	 WebDriver driver= new ChromeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.findElement(By.id("username")).sendKeys(un);
	 driver.findElement(By.name("pwd")).sendKeys(pw,Keys.ENTER);
	 Thread.sleep(2000);
	 driver.close();
}
}
