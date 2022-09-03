package pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.testbase;

public class logginpage extends testbase {
	@FindBy(xpath = " //h2[normalize-space()='Login to Kite']")
	private WebElement frontlogo;

	@FindBy(xpath = "//input[@id='userid']")
	private WebElement useridText;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordtext;

	@FindBy(xpath = " //button[@type='submit']")
	private WebElement loginPage;

	@FindBy(xpath = "//a[text()='Forgot user ID or password?']")
	private WebElement forgetUsernam;

	@FindBy(xpath = "//a[@class='text-light']")
	private WebElement idontHaveAcount;

	@FindBy(xpath = "//img[@alt='Kite']")
	private WebElement logo;

	public logginpage() {
		PageFactory.initElements(driver, this);
	}

	public void loginZerodaapp() throws InterruptedException {
		useridText.sendKeys("D88677");
		passwordtext.sendKeys("Velocity@1234");
		loginPage.click();
		Thread.sleep(1000);
	

	}

	public String verifyfrontlogo() {
		return frontlogo.getText();
	}

	public boolean verifylogo() {
		return logo.isEnabled();
	}

	public Object verifyidontHaveAcount() {
		return idontHaveAcount.isSelected();
	}

	public Object verifyforgetUsernam() {
		return forgetUsernam.isDisplayed();
	}

	public Object verifyloginPage() {
		return loginPage.isEnabled();
	}

	public boolean verifypasswordtext() {
		return passwordtext.isSelected();
	}

}
