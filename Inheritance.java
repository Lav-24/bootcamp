package javaday5;
class Parent
{
	int id;

	public Parent(int id) {
		System.out.println("parent constructor "+id);
	}	
	public Parent()
	{
		System.out.println("default parent constructor");
	}
}
class Child extends Parent
{
	public Child()
	{
		super();
		System.out.println("child constructor");
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		

	}

}
