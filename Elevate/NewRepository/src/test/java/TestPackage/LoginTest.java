package TestPackage;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

    import org.openqa.selenium.firefox.FirefoxDriver;
    

import com.pages.LoginPage;

	import Helpers.ExcelRead;
	public class LoginTest {

		private static String baseUrl;
		static LoginPage login;
		public static WebDriver driver;
		public static JavascriptExecutor js;
		ExcelRead data = new Helpers.ExcelRead();

		@BeforeClass
		public static void setUp() throws Exception {
			System.setProperty("webdriver.gecko.driver", ".\\Libs\\geckodriver.exe");
			driver = new FirefoxDriver();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			baseUrl = "https://scduat.noosh.com/noosh/home/login";
			driver.manage().window().maximize();
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);
			login = new LoginPage(driver);
		}
		
		@Test
		public void verifyValidLogin() throws IOException, InterruptedException {
			// wait till the page loads
			ExcelRead data = new ExcelRead();
			//ArrayList<String> username = data.readExcel(0);
			//ArrayList<String> password = data.readExcel(1);
			login.setUserName("comm.po2");
			login.setPassword("Noosh20188");
			login.getUserName();
			login.getPassword();
			login.clickLoginButton();

		}
		/*
		 * @AfterClass public static void tearDown() throws Exception {
		 * Thread.sleep(4000); driver.quit();
		 */
	}


