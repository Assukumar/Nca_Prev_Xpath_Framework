package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadListPagePom {
@FindBy(xpath = "//img[@title='Create Lead...']")
private WebElement createLeadbtn;
@FindBy(xpath = "//input[@name='search_text']")
private WebElement searchBox;
@FindBy(xpath = "(//select[@name='search_field'])[1]")
private WebElement searchBy;
@FindBy(xpath = "//input[@name='submit']")
private WebElement searchBtn;
@FindBy(xpath = "//a[text()='edit']")
private WebElement editBtn;
@FindBy(xpath = "//a[text()='del']")
private WebElement dltBtn;
@FindBy(xpath = "//input[@name='selectall']")
private WebElement checkBox;
@FindBy(xpath = "(//input[@value='Delete'])[1]")
private WebElement allDlt;
@FindBy(xpath = "(//input[@value='Mass Edit'])[1]")
private WebElement massEdit;
@FindBy(xpath = "(//input[@value='Send Mail'])[1]")
private WebElement sendEmail;


public  LeadListPagePom(WebDriver driver) {
	PageFactory.initElements( driver,this);
	
}

public WebElement getCreateLeadbtn() {
	return createLeadbtn;
}

public WebElement getSearchBox() {
	return searchBox;
}

public WebElement getSearchBy() {
	return searchBy;
}

public WebElement getSearchBtn() {
	return searchBtn;
}

public WebElement getEditBtn() {
	return editBtn;
}

public WebElement getDltBtn() {
	return dltBtn;
}

public WebElement getCheckBox() {
	return checkBox;
}

public WebElement getAllDlt() {
	return allDlt;
}

public WebElement getMassEdit() {
	return massEdit;
}

public WebElement getSendEmail() {
	return sendEmail;
}

/**
 * business logic for click on create lead button
 */

public void clickcreateLeadbutton() {
	getCreateLeadbtn().click();
	
}
public void clickEditBtn() {
	getEditBtn().click();
	
}

   
}
