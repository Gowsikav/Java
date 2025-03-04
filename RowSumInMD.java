class RowSumInMD
{
	public static void main(String[] args) {
		int[][] number={{3,4,5},{7,2,9},{12,8,4},{11,6,90}};
		int sum=0;
		System.out.println("Sum of each row");
		for(int index=0;index<number.length;index++)
		{ sum=0;
			for(int i=0;i<number[index].length;i++)
			{
				sum+=number[index][i];
			    
			}
			System.out.println("Row "+(index+1)+" : "+sum);
		}
	}
	
}