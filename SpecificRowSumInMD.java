class SpecificRowSumInMD
{
	public static void main(String[] args) {

		int[][] number={{3,4,5},{7,2,9},{12,8,4},{11,6,30}};
		int row=2,sum=0;
		for(int index=0;index<number.length;index++)
		{
			for(int i=0;i<number[index].length;i++)
			{
				if(index==(row-1))
				{
					sum+=number[index][i];
				}
			}
		}
		System.out.println("Sum of Row "+row+" is "+sum);

	}
}