package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import pages.CustomerLoginPage;



public class CustomerLoginTest extends MainTest {
	
	@Test(priority=0)
	public void LoginFeature() throws Exception {
		
		
		CustomerLoginPage clp = new CustomerLoginPage(driver);

		clp.login("admin@yourstore.com", "admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	 @Test(priority=1,dataProvider = "newSearch")
	    public void searchCustomer(String fname, String lname) throws Exception {
		 
		 CustomerLoginPage clp = new CustomerLoginPage(driver);
		 clp.searchCustomer(fname,lname);
		 Thread.sleep(7000);		 
	    }
	    
	   
	 @DataProvider
	    public Object[][] newSearch() {
	        
	        Object [][] data = { {"Virat", "Kohli"} };
	        return data;
	        
	    }
	   
	  
	}

