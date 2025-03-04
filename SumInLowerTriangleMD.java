class SumInLowerTriangleMD
{
	public static void main(String[] args) {
		
		int[][] number={{3,4,5},{7,2,9},{12,8,4}};
		int sum=0,row=0;

		for(int index=0;index<number.length;index++)
		{
			sum=0;
			for(int i=0;i<=row;i++)
			{
               sum+=number[index][i];
			}
			
			row++;
			System.out.println(sum);
		}
	}
}