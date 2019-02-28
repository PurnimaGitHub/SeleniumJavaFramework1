	package com.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Spec2D {
		public static WebDriver driver;
		@FindBy(id = "name")
		public static WebElement SpecName;
		@FindBy(id = "quantity1")
		public static WebElement quantity1;
		@FindBy(id = "add")
		public static WebElement addPaper;
		@FindBy(id = "MATERIAL_TYPE")
		public static WebElement TypeMaterial;
		@FindBy(id = "loading")
		public static WebElement paperLoad;
		@FindBy(id = "BRAND")
		public static WebElement brandName;
		@FindBy(id = "WEIGHT")
		public static WebElement paperWeight;
		@FindBy(id = "addTop")
		public static WebElement paperAddButton;
		@FindBy(id = "return")
		public static WebElement returnButton;	
		@FindBy (id="update_spec")
		public static WebElement updateSpecbutton;
		

		public Spec2D(WebDriver driver) {
			Spec2D.driver = driver;
		}

		public void enterNameofSpec(String specName) {
			SpecName.sendKeys(specName);
		}

		public void enterQuantity(String quantity) {
			quantity1.click();
			quantity1.sendKeys(quantity);
		}

		public void paperAdd() {
			addPaper.click();
		}

		public void selectPaper() {
			TypeMaterial.click();
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(paperLoad, "Paper Querying...")));
			Select material = new Select(TypeMaterial);
			material.selectByValue("PAP");
			
			brandName.click();
			wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(paperLoad, "Paper Querying...")));
			Select brand = new Select(brandName);
			brand.selectByValue("PA0000000001");
		
			paperWeight.click();
			wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(paperLoad, "Paper Querying...")));
			Select weight = new Select(paperWeight);
			weight.selectByVisibleText("80");
			paperAddButton.click();
			returnButton.click();
		   }
		
		public void clickonUpdateSpec() throws InterruptedException{
			//Thread.sleep(2000);  
			WebDriverWait wait = new WebDriverWait(driver, 20);
			 wait.until(ExpectedConditions.visibilityOf(updateSpecbutton));
			updateSpecbutton.click();
			}
		
		}



