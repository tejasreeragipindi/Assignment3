import java.util.Scanner;
public class Task {
	void sumOfDigits(int n)
	{
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println("The sum of digits is: "+sum);
	}
	void productOfDigits(int n)
	{
		int product=1;
		while(n!=0) {
			product*=n%10;
			n/=10;
		}
		System.out.println("The product of digits is: "+product);
	}


	public static void main(String[] args) {
		Task ob=new Task();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2!=1)
		{
			ob.sumOfDigits(n);
		}
		else {
			ob.productOfDigits(n);
		}


	}

}
