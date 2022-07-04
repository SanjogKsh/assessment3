package com.mindtree.assessment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assessment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		driver.findElement(By.xpath("//li[@cid='8']")).click();
		//Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//li[@cid='8']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='Income Tax Calculator']//div[@class='clearfix']")).click();
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid checked']")).click();
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid']")).click();
		driver.findElement(By.xpath("//input[@placeholder='AGE (IN YEARS)']")).sendKeys("22");
		driver.findElement(By.xpath("//select[@class='custselect']")).click();
		driver.findElement(By.xpath("//select[@class='custselect']")).sendKeys(Keys.ARROW_DOWN.ENTER);
		driver.findElement(By.xpath("//a[@class='btn_common nextfrm MR10 calculateTax']")).click();
		driver.findElement(By.xpath("//input[@id='annual_salary']")).sendKeys("15000");
		driver.findElement(By.xpath("//input[@id='other_income']")).sendKeys("15000");
		driver.findElement(By.xpath("//a[@id='income_tab_next']")).click();
		driver.findElement(By.xpath("//input[@id='tax_saving_investment']")).sendKeys("2000");
		driver.findElement(By.xpath("//a[@data-link='link4']")).click();
		String tax=driver.findElement(By.xpath("//span[@id='display_tax']")).getText();
		System.out.println(tax);
		driver.findElement(By.xpath("//li[@cid='2']")).click();
		driver.findElement(By.xpath("//a[@title='Top Ranked Funds'][1]")).click();
		
		
		

	}

}
