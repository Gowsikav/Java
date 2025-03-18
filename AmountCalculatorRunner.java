class AmountCalculatorRunner
{
    public static void main(String[] args) 
    {
    	
	    AmountCalculator.totalAmount("Bottle",23.5);
	    AmountCalculator.totalAmount("frill and thrill","Bottle",23.5);
	    double[] prices={24.34,76.4,93.8,30.4};
	    AmountCalculator.totalAmount(prices);
	    double[] priceList={24.34,76.4,93.8,30.4};
	    String[] items={"Pencil","Bottle","Watch","Pen"};
	    AmountCalculator.totalAmount(priceList,items);
	    AmountCalculator.totalAmount(210.45,"202345hgd","T-Shirt");
	    int[] num1={1,3,1};
	    int[] num2={1,4,3,1};
	    int[] num3={1,3,7,8,9,1};
	    AmountCalculator.totalAmount(num1,num2,num3);
	    // zomato 
    }
	
}
