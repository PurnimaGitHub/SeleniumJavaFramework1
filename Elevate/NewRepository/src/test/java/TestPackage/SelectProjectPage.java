package TestPackage;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	import com.pages.CreateProject;

	public class SelectProjectPage extends LoginTest  {

		@Test(priority = 1)
		public void createProject() throws Exception 
		{
			Thread.sleep(5000);
			CreateProject page = PageFactory.initElements(driver, CreateProject.class);
			CreateProject selectProject = new CreateProject(driver);
			selectProject.clickRecentProjectLink();
		}
		
	}



