import java.util.Scanner;
class Square
{
	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter number: ");
	  int num=scan.nextInt();

	  System.out.println("Square of "+num+" is "+(num*num));

	}
}