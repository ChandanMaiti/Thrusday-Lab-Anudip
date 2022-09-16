package com.ems.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ems.entity.Address;
import com.ems.entity.Employee;
import com.ems.exception.GlobalException;

@TestMethodOrder(value =OrderAnnotation.class)
class EmployeeServiceTest {
	EmployeeService employeeService;
	static List<Employee>emplist;
	
@BeforeAll
static void init()
{

}
	@BeforeEach
	void setUp() throws Exception {
		employeeService=new EmployeeService();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	employeeService=null;
	System.out.println("object is garbage collected");
	}

	@Test
	@DisplayName("testing add employee method")
	@Order(1)
	public void testAddEmployee() {
		
		//way-1
//		employeeService.addEmployee(101, "nil", 2000, "kolkata", "India");
//		employeeService.addEmployee(102, "chandan", 1000, "Purba Medinipur", "India");
		
		//way-2 using builder
		Address add=Address.builder().city("kolkata").country("india").build();
		Employee emp=Employee.builder().empId(101).empName("chandan").
			empSal(10000).address(add).build();
		 employeeService.addEmp(emp);
		
		//assertEquals(2, employeeService.lengthOfList());
		int length=employeeService.lengthOfList();
		assertThat(length>0).isTrue();
	}
	
	@Test
	@DisplayName("test case for display method")
	@Order(2)
	public void testDisplayEmpId() throws GlobalException
	{
		Address add=Address.builder().city("Delhi").country("india").build();
		Employee emp=Employee.builder().empId(102).empName("Nilanjan").
				empSal(50000).address(add).build();
		 employeeService.addEmp(emp);
		 
	Employee e=employeeService.displayEmpById(102);
	//assertEquals("Nilanjan", e.getEmpName());
	
	assertThat(e.getEmpSal()).isEqualTo(50000.00);
	}
	
	@Test
	@DisplayName("test case for delete employees")
	@Order(4)
	public void testDeleteAllEmployee()
	{
		//String msg=employeeSevice.deleteAll
		assertEquals("All employees deleted successfully", employeeService.deleteAllEmployee());
	}
	
	@Test
	@DisplayName("test case for calculate appraisal")
	@Order(value =5)
	public void testCalculateAppraisal() {
		employeeService.addEmployee(101, "nill", 20000, "kolkata", "India");
		double appraisal=employeeService.calculateApprisalSalById(101);
			//assertEquals(2000, appraisal);
		assertThat(appraisal).isEqualTo(2000);
	}
	
	@Test
	@DisplayName("test case for calculate yearly salary")
	@Order(6)
	public void testCalculateYearlySalary()
	{
		employeeService.addEmployee(101, "nill", 20000, "kolkata", "India");
		double yearlySal=employeeService.calculateYearlySalary(101);
		
	assertThat(yearlySal).isEqualTo(20000*12);
	}
	
	
	
	@Test
	@DisplayName("testcase for update employee")
	@Order(value=3)
	public void testUpdateEmp() throws GlobalException
	{
		employeeService.addEmployee(101, "nill", 20000, "kolkata", "India");
		Employee emp=employeeService.findId(101);
		emp.setEmpName("nilanjan");
		
		Employee updateEmp=employeeService.updateEmployee(0, emp);
		//assertEquals("nilanjan", updateEmp.getEmpName());
		assertThat(updateEmp.getEmpName()).isEqualTo("nilanjan");
	
	}
	
}
