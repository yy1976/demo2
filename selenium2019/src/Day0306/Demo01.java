package Day0306;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo01 {
	WebDriver driver;
	
	@BeforeClass
	public void openfirefox() throws MalformedURLException{
		//System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		//driver=new ChromeDriver();
		 DesiredCapabilities c=DesiredCapabilities.chrome();
			WebDriver driver= new RemoteWebDriver(new URL("http://192.168.43.28:5555/wd/hub"),c);

	
	}
	@Test
public void login() throws InterruptedException {
		driver.get("http://localhost:8080/examsys/login.thtml");//打开考试系统
		driver.findElement(By.name("username")).sendKeys("hujianming");//定位用户名输入框，并输入
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//定位密码输入框，并输入
		WebElement xia= driver.findElement(By.name("usertype"));//定位类型下拉框
		  Select s=new Select(xia);
		  s.selectByIndex(2);//用索引方式选择
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();//定位登入按钮并点击
		  //driver.switchTo().frame("menu");//定位左页面

		  //driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		 // driver.switchTo().frame(0);
		  driver.findElement(By.linkText("题库管理")).click();
		  driver.findElement(By.linkText("新增题库")).click();
		  driver.switchTo().parentFrame();
		  driver.switchTo().frame(2);
		  driver.findElement(By.name("d_name")).sendKeys("mysql");
		  driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
		}
	
	
}