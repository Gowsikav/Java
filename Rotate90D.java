class Rotate90D
{
	public static void main(String[] args) {
		
		 int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		 int n = matrix.length;
         for (int i = 0; i < n / 2; i++) 
         {
            for (int j = i; j < n - i - 1; j++)
             {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }

        for(int index=0;index<matrix.length;index++)
        {
        	for (int i=0;i<matrix[index].length ;i++)
        	{
        		System.out.print(matrix[index][i]+" ");
        		
        	}
        	System.out.println();
        }
	}
}