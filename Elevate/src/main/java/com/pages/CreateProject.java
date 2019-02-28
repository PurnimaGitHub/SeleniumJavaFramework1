
	package com.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreateProject {

		public static WebDriver driver;
		@FindBy(id = "rp")
		 public static WebElement recentProjects;

		@FindBy(linkText = "RegressionProject")
		public static WebElement changeorderProject;

		@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Schedule'])[1]/following::span[1]")
		public static WebElement selecSpec;

		//@FindBy(linkText = "create_spec")
		@FindBy(css = "div[id='specList_body'] button[id='create_spec']")
		public static WebElement createspecbutton;

		@FindBy(id = "typeId_5011028" )
		public static WebElement Select2D;

		@FindBy(id = "continue")
		public static WebElement continueButton;

		public CreateProject(WebDriver driver) {
			CreateProject.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void clickRecentProjectLink() throws InterruptedException {
			Thread.sleep(5000);
			recentProjects.click();
			changeorderProject.click();
			selecSpec.click();
			Thread.sleep(2000);
			createspecbutton.click();
			Thread.sleep(2000);
			Select2D.click();
			Thread.sleep(2000);
			continueButton.click();
			
		}
		

	}






