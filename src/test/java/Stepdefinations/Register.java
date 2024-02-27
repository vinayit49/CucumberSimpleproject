package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/Users/New/eclipse-workspace/Vinay/CucumberSimpleproject/driver/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("email")).sendKeys("vinayit49@gmail.com");
			
			driver.findElement(By.name("pass")).sendKeys("Bhanuteja@71625");
			driver.findElement(By.name("login")).click();
		}

	}


