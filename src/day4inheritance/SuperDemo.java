package day4inheritance;
class Bank
{
	int amount=1;
}
class Axis extends Bank
{
	int amount=2;
	void test()
	{
		int amount=3;
		System.out.println(super.amount);
		System.out.println(this.amount);
		System.out.println(amount);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis a=new Axis();
		a.test();

	}

}
