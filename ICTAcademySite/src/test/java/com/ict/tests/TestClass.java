package com.ict.tests;

import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ict.constants.AutomationConstants;
import com.ict.pages.AddNewCourse;
import com.ict.pages.NewCourseButton;
import com.ict.pages.RedirectNewCourse;
import com.ict.pages.SignInPage;
import com.ict.utilities.ExcelUtilities;

public class TestClass extends BaseClass {
	
	SignInPage obj;
	RedirectNewCourse obj2;
	NewCourseButton obj3;
	AddNewCourse obj4;
  @Test(priority=1)
  public void ValidLoginVerification() throws Exception {
	  
	  obj=new SignInPage(getDriver());
	  obj.loginClick();
	  
	  String actualemail=ExcelUtilities.readDetails(0, 0).getStringCellValue();
	  obj.EmailSend(actualemail);
	  Assert.assertEquals(AutomationConstants.expemail, actualemail);
	  
	  String actualpassword=NumberToTextConverter.toText(ExcelUtilities.readDetails(0, 1).getNumericCellValue());
	  obj.PasswordSend(actualpassword);
	  Assert.assertEquals(AutomationConstants.exppassword, actualpassword);
	  
	  obj.buttonClick();
	  
	    
	  
  }
  
// @Test(priority=1)	  
//  public void InvaildCredentials() throws Exception
//  {
//     // Thread.sleep(2000);
//      obj=new SignInPage(getDriver());
//      obj.loginClick();
//      String Invaildemailid=ExcelUtilities.readDetails(1, 0).getStringCellValue();
//      System.out.println(Invaildemailid);
//      String Invaildpassword=ExcelUtilities.readDetails(1, 1).getStringCellValue();
//      System.out.println(Invaildpassword);
//      obj.EmailSend(Invaildpassword);
//      obj.PasswordSend(Invaildpassword);
//      
//      
//  }
	  
	
	  
 
  
  @Test(priority=2)
  public void ClickCourse()
  {
	 obj2=new RedirectNewCourse(getDriver()); 
	 obj2.getCourse();
  }
  
  @Test(priority=3)
  public void clickNewCourse()
  {
	  obj3=new NewCourseButton(getDriver());
	  obj3.addCourse();
			  
	  
  }
  
  @Test(priority=4)
  public void AddCourse() throws Exception
  {
	  obj4=new AddNewCourse(getDriver());
	 String actualtitle=ExcelUtilities.readDetails(0, 4).getStringCellValue();
	 obj4.setCourseTitle(actualtitle);
	 Assert.assertEquals(AutomationConstants.exptitle, actualtitle);
	 
	 String actualshort=ExcelUtilities.readDetails(0, 5).getStringCellValue();
	 obj4.setShortName(actualshort);
	 Assert.assertEquals(AutomationConstants.expshort, actualshort);
	 
	 String actualtype=ExcelUtilities.readDetails(0, 6).getStringCellValue();
	 obj4.setType(actualtype);
	 Assert.assertEquals(AutomationConstants.exptype, actualtype);
	 
	 String actualdescription=ExcelUtilities.readDetails(0, 7).getStringCellValue();
	 obj4.setDescription(actualdescription);
	 Assert.assertEquals(AutomationConstants.expdescription, actualdescription);
	 
	 obj4.setStatus();
	 
	 obj4.setCategory();
	 
	 String actualabout=ExcelUtilities.readDetails(0, 8).getStringCellValue();
	 obj4.setAbout(actualabout);
	 Assert.assertEquals(AutomationConstants.expabout, actualabout);
	 
//	 obj4.setEntracedate();
	 
	 String actualfee=NumberToTextConverter.toText(ExcelUtilities.readDetails(0, 9).getNumericCellValue());
	 obj4.setCourseFee(actualfee);
	 Assert.assertEquals(AutomationConstants.expfee, actualfee);
	 
	 String actualregfee=NumberToTextConverter.toText(ExcelUtilities.readDetails(0, 10).getNumericCellValue());
	 obj4.setRegFee(actualregfee);
	 Assert.assertEquals(AutomationConstants.expregfee, actualregfee);
	 
	 
	 
  }
}
