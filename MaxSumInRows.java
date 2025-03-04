class MaxSumInRows
{
	public static void main(String[] args) {
		
		int[][] number={{2,5,1},{5,13,7},{3,8,9}};

		int sum=0,maxSum=0,row=0;
		for(int index=0;index<number.length;index++)
		{
			sum=0;
			for(int i=0;i<number[index].length;i++)
			{
				sum+=number[index][i];
			}
			if(sum>maxSum)
			{
				maxSum=sum;
			    row=index;
		    }
		}

		System.out.println("Maximum Sum in a Row is "+(row+1));
	}
}