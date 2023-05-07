import java.util.Scanner;
public class EvenDigitSum {
	public int sum(int n) {
		int sum=0;
		while (n!=0) {
			int r=n%10;
			if(r%2==0) {
				sum+=r;
			}
			n/=10;
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		EvenDigitSum ob=new EvenDigitSum();
		int result=ob.sum(n);
		System.out.println("The sum of even digit in"+n+"is:"+result);
		


	}

}
