class FloorRunner
{
	public static void main(String[] args) {
		Floor floor =new Floor();
		System.out.println("Default length value: "+floor.length);
		System.out.println("Default width value: "+floor.width);
		System.out.println("Default material value: "+floor.material);
		System.out.println("Default istiled value: "+floor.isTiled);

		floor.length=200;
		floor.width=100;
		floor.material="Marble";
		floor.isTiled=true;

		System.out.println("Updated length value: "+floor.length);
		System.out.println("Updated width value: "+floor.width);
		System.out.println("Updated material value: "+floor.material);
		System.out.println("Updated istiled value: "+floor.isTiled);

	}
	
}