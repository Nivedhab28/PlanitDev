import java.util.Scanner;

public class HighOccurance {

	public static void main(String[] args) {
System.out.println("Enter the string");
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
str=str.replaceAll("\\s", " ");

int[] arr = new int[127];
for (int i=0;i<str.length();i++)
{
	arr[str.charAt(i)]= arr[str.charAt(i)]+1;
}
int max =-1;
char c=' ';
for(int i=0;i<str.length();i++) {
	if(max<arr[str.charAt(i)])
	{
		max=arr[str.charAt(i)];;
		
		c=str.charAt(i);
	}
}
System.out.println("highest Occurance Character:"+c);

	}
	}
