package day4inheritance;
class Parent
{
	void motherTongue()
	{
		System.out.println("speak kannada");
	}
}
class Child extends Parent
{
	void motherTongue()
	{
		super.motherTongue();
		System.out.println("speak english");
	}
}
public class singleInheritance {
public static void main(String args[])
{
	Child child=new Child();
	child.motherTongue();
}
}