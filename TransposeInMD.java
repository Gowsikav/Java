class TransposeInMD
{
	public static void main(String[] args) {
		int[][] number={{3,4,5},{7,2,9},{12,8,4},{11,6,90}};
		
		for(int index=0;index<number[index].length;index++)
		{
			for(int i=0;i<number.length;i++)
			{
				System.out.print(number[i][index]+" ");
			    
			}
			System.out.println();
		}
		
	}
}