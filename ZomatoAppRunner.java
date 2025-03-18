class ZomatoAppRunner
{
	public static void main(String[] args) {

        ZomatoApp.orderFood("Pizza");                                
        ZomatoApp.orderFood("Burger", 2);                            
        String[] items = {"Fries", "Coke", "Pasta"};
        ZomatoApp.orderFood(items);                                  
        ZomatoApp.orderFood("Biryani", "123, MG Road, Delhi");       
        ZomatoApp.orderFood("Sandwich", 3, "456, Park Street, Kolkata"); 
        ZomatoApp.orderFood(items, "789, JP Nagar, Bangalore");      
        ZomatoApp.orderFood("Momos", 5, "555, Anna Nagar, Chennai", "Cash");
        ZomatoApp.details(); 

    }
}