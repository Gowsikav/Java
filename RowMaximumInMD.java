class RowMaximumInMD
{
	public static void main(String[] args) {
		
		int[][] number={{3,4,5},{7,2,9},{12,8,4},{11,6,30}};
		int max=0,row=0;

		for(int index=0;index<number.length;index++)
		{
			
			for(int i=0;i<number[index].length;i++)
			{
				if(number[index][i]>max)
				{
					max=number[index][i];
					row=index;
				}
			}
			
		}
		System.out.println("Row "+(row+1)+" contains maximum: "+max);
	}
}