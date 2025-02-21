import java.util.Scanner;
public class ASCII
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character:");
	    char c=scan.nextLine().charAt(0);
	    System.out.println("ASCII Value of "+c+" is "+(int)c);
	}
}