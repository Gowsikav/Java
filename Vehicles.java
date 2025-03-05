class Vehicles
{
	static String vehicleName;
	static String vehicleType;
	static String personsTravelled[]={null,null};

	public static void display()
	{
		vehicleName="Bike";
		vehicleType="Two Wheller";
		personsTravelled[0]="Ram";
		personsTravelled[1]="Sita";

		System.out.println("Vehicle Name: "+vehicleName);
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Persons Travelled");
		for(String name:personsTravelled)
			System.out.println(name);
	}
}