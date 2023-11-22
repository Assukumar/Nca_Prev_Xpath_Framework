package testPractise;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;
import objectRepository.LeadListPagePom;

public class Tc_04  extends BaseClass{

	@Test
		 public void leadmod() {
	   	  HomePagePom HP=new HomePagePom(driver);
	   	  HP.clickLeads();
	   	  LeadListPagePom LPM=new LeadListPagePom(driver);
	   	  LPM.clickcreateLeadbutton();
	     }
}
