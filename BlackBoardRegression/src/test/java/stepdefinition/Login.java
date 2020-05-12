package stepdefinition;

import cucumber.api.java.en.Given;
import pages.BaseClass;

public class Login extends BaseClass {

	@Given("login as staff")
	public void loginasstaff() throws Exception  
	{
		BaseClass.initialisation();
		BaseClass.stafflogin();
	}
	
	@Given("login as student")
	public void loginasstudent() throws Exception {
		BaseClass.initialisation();
		BaseClass.studentlogin();
	}
	@Given("login as student2")
	public void loginasstudent2() throws Exception {
		BaseClass.initialisation();
		BaseClass.studentlogin2();
		
	}
	@Given("login as student3")
	public void loginasstudent3() throws Exception {
		BaseClass.initialisation();
		BaseClass.studentlogin3();
	}
	
}
