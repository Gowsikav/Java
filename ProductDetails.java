public class ProductDetails{
	
	public static void main(String[] args)
	{
		String name="Laptop";
		int price=4000;
		int discount=10;
		String brandName="Dell";
		int gst=12;
		int donation=100;
		int deliveryFee=150;
		int platformFee=40;
       // Discount Amount Calculated
		int discountAmount=(price*discount)/100;
		// GST Amount Calculated
		int gstAmount=(price*gst)/100;
		//Total Amount
		int total=price-discountAmount+gstAmount+donation+deliveryFee+platformFee;

		System.out.println(" Product Details ");
		System.out.println("Name: "+name);
		System.out.println("discount: "+discount+"%");
		System.out.println("BrandName: "+brandName);
		System.out.println("GST: "+gst+"%");
		System.out.println("Donation: "+donation);
		System.out.println("Delivery Fee: "+deliveryFee);
		System.out.println("platform Fee: "+platformFee);
		System.out.println("Total Payable Amount: "+total);
		System.out.println("Total amount without GST: "+(total-gstAmount));
		System.out.println("Total Amount: "+total); 
		
	}
}