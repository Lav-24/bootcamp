package javaday5;
class Emp
{
int id;
String name;
static String dept;
}
public class Employee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp.dept="deleloper";
		e1.id=1;
		e1.name="manish";
		e1.dept="dept1";
		e2.id=2;
		e2.name="riya";
		e2.dept="dept2";
		System.out.println(e1.id+" "+e1.name+" "+e1.dept);
		System.out.println(e2.id+" "+e2.name+" "+e2.dept);
		
		

	}

}
