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
		driver.get("http://localhost:8080/examsys/login.thtml");//�򿪿���ϵͳ
		driver.findElement(By.name("username")).sendKeys("hujianming");//��λ�û�������򣬲�����
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//��λ��������򣬲�����
		WebElement xia= driver.findElement(By.name("usertype"));//��λ����������
		  Select s=new Select(xia);
		  s.selectByIndex(2);//��������ʽѡ��
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();//��λ���밴ť�����
		  //driver.switchTo().frame("menu");//��λ��ҳ��

		  //driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		 // driver.switchTo().frame(0);
		  driver.findElement(By.linkText("������")).click();
		  driver.findElement(By.linkText("�������")).click();
		  driver.switchTo().parentFrame();
		  driver.switchTo().frame(2);
		  driver.findElement(By.name("d_name")).sendKeys("mysql");
		  driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
		}
	
	
}