class BlocksRunner
{
	public static void main(String[] args) {
		
		System.out.println("Main method");
        Blocks.display();
		System.out.println("Name: "+Blocks.name);
		
	}
	static {
			System.out.println("Static block in main class");
		}
}