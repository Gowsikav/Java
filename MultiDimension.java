class MultiDimension
{
	public static void main(String[] args) {
		int[][] number={{3,4,5},{7,2,9},{12,8,4},{11,6,90}};
		
		for(int index=0;index<number.length;index++)
		{
			for(int i=0;i<number[index].length;i++)
			{
				System.out.print(number[index][i]+" ");
			    
			}
			System.out.println("\n=======");
		}
		
	}
}