package javaday5;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		System.out.println("enter the number of times:");
		int b=sc.nextInt();
		for(int i=1;i<=b;i++)
			System.out.println(i*a);
		

	}

}
