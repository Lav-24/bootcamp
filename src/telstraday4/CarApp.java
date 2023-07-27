package telstraday4;
class Car
{
	int modelNo;
	String brandName;
	int kilometerDriven;
	String checkCarStatus()
	{
		if(kilometerDriven<=5000)
			return "it is a new car";
		else if(kilometerDriven>5000 && kilometerDriven<=20000)
			return "car is in good condition";
		return "car is old";
	}
	void displayCarDetails()
	{
		System.out.println("modelno:"+modelNo);
		System.out.println("brand:"+brandName);
	}
}
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
Car car=new Car();
car.modelNo=2022;
car.brandName="honda";
car.kilometerDriven=12000;

Car car2=new Car();
car2.brandName="suzuki";
car2.modelNo=2023;
car2.kilometerDriven=4000;
System.out.println(car2.checkCarStatus());
car2.displayCarDetails();
	}

}
