package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditLeadPagePom {
     @FindBy(xpath = "//input[@name='firstname']")
     private WebElement editFirstNamElement;

	public WebElement getEditFirstNamElement() {
		return editFirstNamElement;
	}

	public EditLeadPagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
     /*
      * Business logic for click on firstname
      */
	 public void clickFirstname() {
		 getEditFirstNamElement().clear();
		 getEditFirstNamElement().sendKeys("name");
}
}