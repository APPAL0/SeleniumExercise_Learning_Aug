package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CustomerLoginPage {
	
	public WebDriver driver;

	public CustomerLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Customer page field data Identification

		By txtEmail = By.id("Email");
		By txtPass = By.id("Password");
		By btnLogin = By.tagName("button");
		By menuCustomer=By.cssSelector("html>body>div:nth-of-type(3)>aside>div>div:nth-of-type(4)>div>div>nav>ul>li:nth-of-type(4)>a");
		By itemCustomer=By.xpath("//p[text()=' Customers']");
		By searchFirstName=By.xpath("//input[@id='SearchFirstName']");
		By searchLastName=By.xpath("//input[@id='SearchLastName']");
		By btnSearch=By.xpath("//button[@id='search-customers']");
		By verifyCustomer=By.xpath("//td[text()='Virat Kohli']");
		
		

		// Customer page Methods

		public void enterEmail(String email) {

		
			driver.findElement(txtEmail).clear();
			driver.findElement(txtEmail).sendKeys(email);

		}

		public void enterPass(String pwd) {

			driver.findElement(txtPass).clear();
			driver.findElement(txtPass).sendKeys(pwd);

		}

		public void clickLogin() {

		
			driver.findElement(btnLogin).click();
			

		}
		
		public void clickCustomerMenu() {

			
			driver.findElement(menuCustomer).click();
			
		}
		
		public void clickCustomerItem() {

		
			driver.findElement(itemCustomer).click();
			
		}
		
		public void enterFirstName(String fname) {

		
			
			driver.findElement(searchFirstName).sendKeys(fname);

		}
		
		public void enterLastName(String lname) {

		
			
			driver.findElement(searchLastName).sendKeys(lname);

		}
		public void clickSearch() {

		
			driver.findElement(btnSearch).click();
		}
		
		public void validateCustomer() {

		
		    WebElement element = driver.findElement(verifyCustomer);
			String searchtext=element.getText();
			System.out.println("Name retrieved from Customers table is:" +searchtext);
			
			
			Assert.assertEquals(searchtext, "Virat Kohli");
		
			
		}

		
		public void login(String email, String pwd) {
			
			enterEmail(email);
			enterPass(pwd);
			clickLogin();
			clickCustomerMenu();
			clickCustomerItem();
			
		}
		
       public void searchCustomer(String fname, String lname) {
			
			enterFirstName(fname);
			enterLastName(lname);
			clickSearch();
			validateCustomer();
		}
		
}
