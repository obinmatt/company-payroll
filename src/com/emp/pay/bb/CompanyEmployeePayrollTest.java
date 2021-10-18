package com.emp.pay.bb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CompanyEmployeePayrollTest {
	
	Employee employee = new Employee();
	SalariedEmployee sal = new SalariedEmployee();
	HourlyEmployee howard = new HourlyEmployee();
	CommissionEmployee cam = new CommissionEmployee();
	BaseSalariedCommissionEmployee bob = new BaseSalariedCommissionEmployee();
	PieceWorkerEmployee pete = new PieceWorkerEmployee();
	
	// Since the classes do not have constructors, I am using the setters to give the variables default values
	@Before
	public void setUp() throws Exception {
		employee.setName("Temp");
		employee.setAddress("Temp");
		employee.setSIN("Temp");
		sal.setWeeklySalary(0);
		howard.setWage(0);
		howard.setHours(0);
		cam.setCommissionRate(0);
		cam.setGrossSales(0);
		bob.setBaseSalary(0);
		pete.setWagePerPieces(0);
		pete.setNumberOfPiecesOfMerchandise(0);
	}
	
	// Employee Tests
	@Test
	public void testEmployeeGetName() {
	    assertEquals(employee.getName(), "Temp");
	}
	@Test
	public void testEmployeeSetName() {
		employee.setName("Bob");
	    assertEquals(employee.getName(), "Bob");
	}
	
	@Test
	public void testEmployeeGetAddress() {
	    assertEquals(employee.getAddress(), "Temp");
	}
	
	@Test
	public void testEmployeeSetAddress() {
		employee.setAddress("123 Maple");
	    assertEquals(employee.getAddress(), "123 Maple");
	}
	
	@Test
	public void testEmployeeGetSIN() {
	    assertEquals(employee.getSIN(), "Temp");
	}
	
	@Test
	public void testEmployeeSetSIN() {
		employee.setSIN("123456");
	    assertEquals(employee.getSIN(), "123456");
	}
	
	//SalariedEmployee Tests
	@Test
	public void testSalEmployeeGetWeeklySalary() {
		assertEquals(sal.getWeeklySalary(), 0, 0);
	}
	
	@Test
	public void testSalEmployeeSetWeeklySalary() {
		sal.setWeeklySalary(850.00);
	    assertEquals(sal.getWeeklySalary(), 850.00, 0);
	}
	
	@Test
	public void testSalariedEmployeeEarnings() {
		sal.setWeeklySalary(850.00);
		assertEquals(sal.salariedEmployeeEarnings(), 850.00, 0);
	}
	
	//HourlyEmployee Tests
	@Test
	public void testHourlyEmployeeGetWage() {
		assertEquals(howard.getWage(), 0, 0);
	}
	
	@Test
	public void testHourlyEmployeeSetWage() {
		howard.setWage(21.99);
	    assertEquals(howard.getWage(), 21.99, 0);
	}
	
	@Test
	public void testHourlyEmployeeGetHours() {
		assertEquals(howard.getHours(), 0, 0);
	}
	
	@Test
	public void testHourlyEmployeeSetHours() {
		howard.setHours(38.00);
		assertEquals(howard.getHours(), 38.00, 0);
	}
	
	@Test
	public void testHourlyEmployeeEarnings() {
		howard.setWage(21.99);
		howard.setHours(38.00);
		assertEquals(howard.hourlyEmployeeEarnings(), 835.6199999999999, 0);
	}
	
	@Test
	public void testHourlyEmployeeEarnings41() {
		howard.setHours(41.00);
		howard.setWage(21.99);
		assertEquals(howard.hourlyEmployeeEarnings(), 912.5849999999999, 0);
	}
	
	//CommissionEmployee Tests
	@Test
	public void testCommissionEmployeeGetCommissionRate() {
		assertEquals(cam.getCommissionRate(), 0, 0);
	}
	
	@Test
	public void testCommissionEmployeeSetCommissionRate() {
		cam.setCommissionRate(12.51);
	    assertEquals(cam.getCommissionRate(), 12.51, 0);
	}
	
	@Test
	public void testCommissionEmployeeGetGrossSales() {
		assertEquals(cam.getGrossSales(), 0, 0);
	}
	
	@Test
	public void testCommissionEmployeeSetGrossSales() {
		cam.setGrossSales(269.21);
		assertEquals(cam.getGrossSales(), 269.21, 0);
	}
	
	@Test
	public void testCommissionEmployeeEarnings() {
		cam.setCommissionRate(12.51);
		cam.setGrossSales(269.21);
		assertEquals(cam.commissionEmployeeEarnings(), 3367.8170999999998, 0);
	}
	
	//BaseSalariedCommissionEmployee Tests
	@Test
	public void testBaseSalariedCommissionEmployeeGetBaseSalary() {
		assertEquals(bob.getBaseSalary(), 0, 0);
	}
	
	@Test
	public void testBaseSalariedCommissionEmployeeSetBaseSalary() {
		bob.setBaseSalary(600.00);
	    assertEquals(bob.getBaseSalary(), 600.00, 0);
	}
	
	@Test
	public void testBaseSalariedCommissionEmployeeEarnings() {
		bob.setCommissionRate(14.25);
		bob.setGrossSales(302.51);
		assertEquals(bob.baseSalariedCommissionEmployeeEarnings(), 4310.7675, 0);
	}
	
	//PieceWorkerEmployee Tests
	@Test
	public void testPieceWorkerGetWagePerPeices() {
		assertEquals(pete.getWagePerPieces(), 0, 0);
	}
	
	@Test
	public void testPieceWorkerSetWagePerPeices() {
		pete.setWagePerPieces(16.98);
	    assertEquals(pete.getWagePerPieces(), 16.98, 0);
	}
	
	@Test
	public void testPieceWorkerGetNumOfPiecesOfMerch() {
		assertEquals(pete.getNumberOfPiecesOfMerchandise(), 0);
	}
	
	@Test
	public void testPieceWorkerSetNumOfPiecesOfMerch() {
		pete.setNumberOfPiecesOfMerchandise(45);
	    assertEquals(pete.getNumberOfPiecesOfMerchandise(), 45);
	}
	
	@Test
	public void testPieceWorkerEmployeeEarnings() {
		pete.setWagePerPieces(16.98);
		pete.setNumberOfPiecesOfMerchandise(45);
		assertEquals(pete.pieceWorkerEmployeeEarnings(), 771.741, 0);
	}
}
