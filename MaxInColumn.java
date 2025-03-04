class MaxInColumn
{
	public static void main(String[] args) {
		
		int[][] number={{2,5,8},{12,5,1},{2,16,8},{11,2,1}};
		int sum=0,maxSum=0,cols=0;

		for (int index = 0; index < number[0].length; index++)
		 {
            sum = 0;
            for (int i = 0; i < number.length; i++) 
            {
                sum += number[i][index];
            }
            if (sum > maxSum)
             {
                maxSum = sum;
                cols = index;
            }
        }

		System.out.println("Maximum Sum in a Column is "+(cols+1));
	}
}