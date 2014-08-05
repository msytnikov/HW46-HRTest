package HRTest;


import org.junit.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HRTest extends HRTestLogIn {

	@Test
	public void test_01_verify_login() {
		MainPage homePage = new MainPage(driver);
		homePage.loginS();
		
	}

	@Test
	public void test_02_verify_add_Employee() throws InterruptedException {
		EmployeeQuickAddPage eQuickAdd = new EmployeeQuickAddPage(driver);
		eQuickAdd.quickAddEmp();

	}

	@Test
	public void test_03_verify_deleteEmployee() {

		EmployeePage deleteE = new EmployeePage(driver);
		deleteE.deleteEmp();
	}
}