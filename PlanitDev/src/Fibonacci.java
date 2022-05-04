import java.util.Scanner;

public class Fibonacci {
	public static int nthFibo(int input1)
	{
		if(input1==1)
		{
			return 0;
			
		}
		else if(input1==2)
		{
			return 1;
			
		}
		else if(input1==3)
		{
			return 2;
			
		}
		else {
			return nthFibo(input1-1)+nthFibo(input1-2);
			
		}
	}
	
	public static void main(String[] args) {
	int num, result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	num = sc.nextInt();
	result=nthFibo(num);
	System.out.println("Nth value is "+result);
	if(num<0) {
		System.out.println("Please enter positive number");
		
	}
	else {
		int a=0,b=1,c=0;
		while(c<num) {
			c=a+b;
			a=b;
			b=c;
			}
		if(c==num) {
			System.out.println("Entered Number"  +num+  "is Fibonacci");
			}
		else
		{
			System.out.println("Entered Number" +num+ "is  not Fibonacci");
			
		}
	
	
	}
	
	}
}
