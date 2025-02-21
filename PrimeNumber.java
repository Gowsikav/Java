import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int num=scan.nextInt();
	 if(num<=1)
	 	System.out.println(num+" is not a Prime Number");

	 for(int i=2;i<=Math.sqrt(num);i++)
	 {
	 	if(num%i==0)
	 	{
	 		System.out.println(num+" is not a Prime Number");
	 		return;
	 	}
	 }
	 System.out.println(num+" is a Prime Number");

	}
}