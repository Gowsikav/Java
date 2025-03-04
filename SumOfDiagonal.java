class SumOfDiagonal
{
	public static void main(String[] args) {
		int[][] number={{2,5,12},{5,13,7},{3,8,9}};
		int sum=0;
		for(int index=0;index<number.length;index++)
		{
			for(int i=0;i<number[index].length;i++)
			{
				if(index==i || i==number[index].length-index)
					sum+=number[index][i];
				

			}
		}
		System.out.println("Sum of Diagonals: "+sum);
	}
}