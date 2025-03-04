class LargestInRow
{
	public static void main(String[] args) {
		int[][] number={{2,5,12},{5,13,7},{3,8,9}};
		int max=0;
		for(int index=0;index<number.length;index++)
		{
			max=0;
			for(int i=0;i<number[index].length;i++)
			{
				if(number[index][i]>max)
					max=number[index][i];
			}
			System.out.println("Row "+(index+1)+" max is "+max);
		}
	}
}