package fuctionWithArgumentWithoutReturnValue;

import java.util.Scanner;

public class Sum {
	public static void main(String ar[]) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1=sn.nextInt();
		int num2=sn.nextInt();
		int sum=result(num1,num2);
		System.out.println("sum of two number is : "+sum);
				
		

}
	static int  result(int a,int b) {
		int s=a+b;
		return s;
	}
}