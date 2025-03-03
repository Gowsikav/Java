class SecondLargest
{
	public static void main(String[] args) {
		
		int[] list={3,7,5,29,50,47};
		int firstMax=list[0],secondMax=0;
		for(int index=0;index<list.length;index++)
		{
			if(list[index]>firstMax)
			{
				secondMax=firstMax;
				firstMax=list[index];
			}
			else if(list[index]>secondMax && secondMax!=firstMax)
			{
				secondMax=list[index];
			}

		}
		System.out.println("Second max: "+secondMax);
	}
}