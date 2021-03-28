package ApachePOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sayem.util.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		//Xls_Reader is class from other package, so we need to import
				//defining object for the class
				Xls_Reader reader =new Xls_Reader ("D:\\Selenium Workspace\\TestNGProject\\src\\TestData\\TestData.xlsx");
				String firstName = reader.getCellData("Sheet1","FirstName",2);
				System.out.println("your excel data" + firstName);
		
		//driver.findElement(By.className("h-c-header__nav-li-link")).click();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(firstName);
		
		
	}

}
