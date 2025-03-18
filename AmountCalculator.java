class AmountCalculator
{
	static double gstAmount,total;
	static void totalAmount(String itemName, double price)
	{
		gstAmount=GSTCalculator.calculateGST((double)price);
		System.out.println("GST amount is "+gstAmount);
		total=price+gstAmount;

	}
	
	static void totalAmount(String brandName,String itemName,double price)
	{
		if(brandName.equalsIgnoreCase("frill and thrill"))
		{
			total=price-(price*50)/100;
		}
		System.out.println("Total amount with discount: "+total);
		System.out.println("Total amount with GST: "+(total+gstAmount));
	}

	static void totalAmount(double[] prices)
	{
		double max=0;
		for(int i=0;i<prices.length;i++)
		{
			double temp=GSTCalculator.calculateGST((double)prices[i]);
			System.out.println("GST for "+prices[i] +" is "+temp);
			prices[i]=prices[i]+temp;
		}
		System.out.println("\nPrices with GST");

		for(double amount:prices)
		{
			if(amount>max)
				max=amount;
			System.out.print(amount+"  ");

		}
		System.out.println("\nMaximum price with GST is "+max);
	}

	static void totalAmount(double prices[],String itemNames[])
	{

		if(prices.length==itemNames.length)
		{
			System.out.println("\nItems with prices list");
			for(int i=0;i<prices.length;i++)
			{
				System.out.println(itemNames[i]+": "+prices[i]);
			}
		}
		else 
		{
			System.out.println("Prices and itemnames are not matched");
		}
	}

	static void totalAmount(double price,String couponCode, String itemName)
	{
		if(couponCode.equals("2024Ut0!"))
		{
			price=price+GSTCalculator.calculateGST((double)price);
			total=price-(price*25)/100;

		}
		else if(couponCode.equals("202345hgd")&& itemName.equalsIgnoreCase("t-shirt"))
		{
			total=price-(price*33.3)/100;
		}
		else 
		{
			total=price-(price*10)/100;
		}
		System.out.println(itemName+" price with discount is "+total);
	}

	static void totalAmount(int[] num1,int[] num2,int[] num3)
	{
		System.out.print("\nCommon elements in three arrays are ");
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num2.length;j++)
			{
				if(num1[i]==num2[j])
				{
				   for(int k=0;k<num3.length;k++)
				   {
					  if(num2[j]==num3[k])
					   {
						System.out.print(num1[i]+" ");
						num3[k]=-1;
					   }
				    }
			    }
			}
		}
	}
}