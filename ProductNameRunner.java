class ProductNameRunner
{
	public static void main(String[] args) 
	{
		ProductNames.saveProduct("iPhone");
		ProductNames.saveProduct("Realme");
		ProductNames.saveProduct("Samsung");
		ProductNames.saveProduct("Nokia");
		ProductNames.saveProduct("Galaxy");
		ProductNames.saveProduct("MacBook");
		ProductNames.displayProducts();
		ProductNames.searchProduct("Nokia");
		ProductNames.searchProduct("Dell");

	}
}