package BDD.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe" ); 
		 WebDriver driver=new ChromeDriver(); 
//		 driver.get("https://qualysguard.p26.eng.in03.qualys.com/portal-front/");
//		 driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
//		 driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
//		 Thread.sleep(1234);
//		// driver.getTitle();
//		 System.out.println(driver.getTitle());
//		 Thread.sleep(1234);
//		 driver.close();
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getCurrentUrl());
		 driver.get("https://in.yahoo.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.close();
	}

}
