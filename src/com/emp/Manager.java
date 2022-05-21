package com.emp;

public class Manager implements Employee {
	
	public void managerId() {
		int b=345;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Manager e=new Manager();
		e.empId();
		e.empName();		
		
	}

	@Override
	public void empId() {
		int id=1234;
		System.out.println(id);
		
	}

	@Override
	public void empName() {
		String name="ashok";
		System.out.println(name);
				
	}

	
	
}
