class BubbleSort
{
	public static void main(String[] args) {
		int[] number={53,0,76,8,7,3,1,67};
		int temp=0;
		boolean flag=true;
		for(int pass=0;;pass++)
		{ 
			flag=true;
			for(int secIndex=0;secIndex<number.length-1;secIndex++)
			{
				if(number[secIndex]>number[secIndex+1])
				{
                     temp=number[secIndex];
                     number[secIndex]=number[secIndex+1];
                     number[secIndex+1]=temp;
                     flag=false;
				}
			}
			if(flag)
				break;
		}

		for(int index=0;index<number.length;index++)
		{
			System.out.print(number[index]+" ");
		}
	}
}