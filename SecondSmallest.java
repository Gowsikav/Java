class SecondSmallest
{
	public static void main(String[] args) {
		
		int[] list={3,7,5,29,50,47,1};
		int firstMin=list[0],secondMin=list[0];
		for(int index=0;index<list.length;index++)
		{
			if(list[index]<firstMin)
			{
				secondMin=firstMin;
				firstMin=list[index];
			}
			else if(list[index]<secondMin && list[index]!=firstMin)
			{
				secondMin=list[index];
			}

		}
		System.out.println("Second Minimum: "+secondMin);
	}
}