package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium
{
  @Test
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Nikhil\\vsts-agent-win7-x64-2.122.1\\_work\\1\\s\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 String baseUrl = "http://www.google.com";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle))
	        {
	            System.out.println("Test Passed!");
	        } 
	        else 
	        {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	       
	    }

	
  }

