package com.abu;

public class Employee 
{
	private int empId;
	private String  empName;
	private double salary;
	
	private Project proj; //has_a relationship of project class into employee
	
	public Project getProj()
	{
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}

	public Employee()
	{
		
	}
	
	public Employee(int empId, String empName, double salary) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public void Display()
	{
		System.out.println(" Employee ID : "+empId);
		System.out.println(" Employee Name : "+empName);
		System.out.println("  Salary of Employee : "+salary);
		proj.Display();
	}
	
	public void jaiBalaji()
	{
		System.out.println(" we are creating one bean for employee class");
	}
	
	public void Goodbye()
	{
		System.out.println(" thanks for creating bean ");
	}
	
}
