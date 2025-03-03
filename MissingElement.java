class MissingElement
{
	public static void main(String[] args) {
		int[] list={2,4,5,6};
		int start=list[0];
		for(int index=1;index<list.length;index++)
		{
			if(++start!=list[index])
			{
                System.out.println("Missing Element: "+start);
                break;
			}

		}
		
	}
	
}