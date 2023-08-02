package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class MainTest {
WebDriver driver;
	

    @AfterTest
    public void closeApp() {
        
        System.out.println("Application Closing");
        
        
        //close the browser
        driver.close();  
       
    }
    
    @BeforeTest
    public void launchApp() throws Exception {
        
        System.out.println("Application Launching");
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        driver.get(Constants.nopComm);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
    }
    
    

}