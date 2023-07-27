package telstraday4;
class Employee
{
	int id;
	String name;
	String dept;
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=45000;
		Employee employee=new Employee(1001,"rohit","hr");
		System.out.println(salary);
		System.out.println(employee);

	}

}
