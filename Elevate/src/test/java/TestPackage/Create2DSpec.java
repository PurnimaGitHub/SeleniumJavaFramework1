 	package TestPackage;
	
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	import com.pages.Spec2D;

	public class Create2DSpec extends SelectProjectPage {
		static Spec2D Spec2D = new Spec2D(driver);

		@Test(priority = 2)
		public void createSpec2D() throws Exception {
			Thread.sleep(1000);
			PageFactory.initElements(driver, Spec2D.class);
			Spec2D.enterNameofSpec("PaperSpec9");
			Spec2D.enterQuantity("2345");
			Spec2D.paperAdd();
			Spec2D.selectPaper();
			Spec2D.clickonUpdateSpec();	
		}
	}
	
	


