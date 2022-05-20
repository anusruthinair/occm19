import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		System.out.println(rev);
		System.out.println(num==rev?"palindrome":"not palindrome");
		
	}

}
