package com.test.app.medicure_test_project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
	public static void main( String[] args ) throws InterruptedException
    {			
		//initialize the chrome driver
		ChromeOptions options = new ChromeOptions();
    	
	 	WebDriver driver = new ChromeDriver(options);
	 	
	 	//open the web application
        driver.get("http://18.223.0.47:8083/contact.html");
        
        
        String title = driver.getTitle();
        System.out.println(title);
        
        //1. Locate Name
        WebElement name = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        name.sendKeys("test-user");
        System.out.println(name.getText().toString());
        
        //2. Locate Phone number
        WebElement number = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        number.sendKeys("111111111");
        System.out.println(number.getText().toString());
        
        //3. Locate Email and Enter Email
        WebElement mail = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        mail.sendKeys("test@test.com");
        System.out.println(mail.getText());
        
        //4. Locate Message and Enter Message
        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        message.sendKeys("Need an appointment !");
        System.out.println(message.getText());
        
        Thread.sleep(2000);
        
        //5. Locate Send Button and click to send the message.
        WebElement sendButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        sendButton.click();
        Thread.sleep(2000);
        
        String response = driver.findElement(By.id("message")).getText();
        System.out.println(response);
        
        
        
        driver.quit();
        
    }
}
