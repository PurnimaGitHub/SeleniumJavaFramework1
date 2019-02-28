	package TestPackage;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

	import com.pages.RFEPage;

	public class selectRFEPage extends LoginTest {
		
		 public static RFEPage rfe = new RFEPage(driver);
		
		@Test
		 public void createRFE () throws Exception{
			PageFactory.initElements(driver, RFEPage.class);
			Thread.sleep(4000);
			rfe.selectProject();
			rfe.findEstimates();
			rfe.createRFE();
			rfe.RFEpage("RFE123");
			rfe.dueDate();
			rfe.completionDate();
			
		}
		}

	
	

