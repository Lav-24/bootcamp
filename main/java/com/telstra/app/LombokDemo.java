package com.telstra.app;
import com.telstra.model.Employee;
public class LombokDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee= new Employee(1,"john","hr");
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("rahul");
		employee2.setDept("developer");
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDept());
		System.out.println(employee2.getId()+" "+employee2.getName()+" "+employee2.getDept());
		System.out.println(employee);
	}

}
