import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter number:");
	   int num=scan.nextInt();
       int rev=0,number=num;
	   while(num>0)
	   {
          rev=rev*10+(num%10);
          num/=10;
	   }
	   if(number==rev)
	      System.out.println(number+" is a Palindrome");
	  else 
	  	System.out.println(number+" is not a Palindrome");

	}
}