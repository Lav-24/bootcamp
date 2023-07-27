package day4encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		//employee.id=1;
		//employee.name="manish";
		employee.setId(1);
		employee.setName("manish");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
	}

}
