import java.util.*;
public class Task{
	public static void main(String[] arr) {
		Scanner scan=new Scanner(System.in);
		// 1. swap two integer
		int num1=10;
		int num2=20;
		System.out.println("Before swap: num1:"+num1+" num2:"+num2);

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swap: num1:"+num1+" num2:"+num2);

		//2.declare variables of different data types
		System.out.println("\nDeclare variables and print");
		int a=10;
		double b=1287834;
		float c=374.53f;
		char d='r';
		boolean e=true;
		System.out.println("Integer: "+a+"\nDouble: "+b+"\nfloat: "+c+"\nCharacter: "+d+"\nBoolean: "+e);

        //3.calculate are and perimeter of rectangle  
       System.out.println("\nArea and Perimeter of rectangle");

        
        System.out.println("\nGive length of rectangle:");
        int length=scan.nextInt();
        System.out.println("Give width of rectangle:");
        int width=scan.nextInt();
        System.out.println("Area of Rectangle: "+(length*width));
        System.out.println("Perimeter of Rectangle: "+(2*(length+width)));  

       //4.compare two numbers and print largest

        System.out.println("\nPrint largest number between two numbers");
        System.out.println("Enter First number:");
        int number1=scan.nextInt();
        System.out.println("Enter Second number:");
        int number2=scan.nextInt();
        if(number1>number2)
        	System.out.println("Largest number is number1:"+number1);
        else
        	System.out.println("Largest number is number2:"+number2);   

        //5.calculate area of reactangle using length*width

        System.out.println("\n Area of Rectangle using length*width");
        System.out.println("Length of rectangle: "+length);
        System.out.println("Width of rectangle: "+width);
        System.out.println("Area of Rectangle: "+(length*width));  

        //6.voting eligibility

        System.out.println("\n Voting Eligibility checking");
        System.out.println("Enter age:");
        int age=scan.nextInt();
        if(age>=18)
        	System.out.println("Eligible for voting");
        else
        	System.out.println("Not Eligible for voting");   

        //7.calculate the total bill. Apply a discount of 10% if the total bill exceeds $100.

        System.out.println("\nTotal bill exceeds $100 add 10% discount");
        System.out.println("Enter the bill amount:");
        int totalAmount=scan.nextInt();
        if(totalAmount>100)
        	totalAmount=totalAmount-(totalAmount*10)/100;
        System.out.println("Your total amount to pay is "+totalAmount);  

        //8. check for free shipping if amount > $50

        System.out.println("\nFree shipping if amount greater than $50");
        System.out.println("Enter amount:");
        int amount=scan.nextInt();
        if(amount>50)
        	System.out.println("You're eligible for free shipping");
        else 
        	System.out.println("You're not eligible for free shipping"); 


        //9. find type of vehicle for a person based on age

        System.out.println("\nType of vehicle for a person based on age");
        System.out.println("Enter age:");
        int curAge=scan.nextInt();
        if(curAge<15)
        	System.out.println("You can ride a bicycle");
        else if(curAge<20)
        	System.out.println("You can ride a bike");
        else 
        	System.out.println("You can ride a car");  


       //10. Type of fuel for vehicle based on engine type

        System.out.println("\nThis is a Engine types");
        System.out.println("1. Spark Ignition");
        System.out.println("2. Compression Ignition");
        System.out.println("3. Electric Motor");
        System.out.println("4. Hybrid");
        System.out.println("5. Gas Turbine");
        System.out.print("Enter your choice (1-5): ");

        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Fuel required: Petrol");
                break;
            case 2:
                System.out.println("Fuel required: Diesel");
                break;
            case 3:
                System.out.println("Fuel required: Storage Battery (Electric)");
                break;
            case 4:
                System.out.println("Fuel required: Petrol and Storage Battery (Hybrid)");
                break;
            case 5:
                System.out.println("Fuel required: Liquefied Petroleum Gas (LPG) or Compressed Natural Gas (CNG)");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }


		
	}

}
	
