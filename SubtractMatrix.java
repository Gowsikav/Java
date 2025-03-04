class SubtractMatrix
{
	public static void main(String[] args) {
		
		int[][] matrixA = {{6, 6}, {7, 8}};
        int[][] matrixB = {{1, 2}, {2, 4}};
        int[][] result = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i <matrixA.length ; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Matrix Substraction");
        for(int index=0;index<result.length;index++)
        {
        	for(int i=0;i<result[index].length;i++)
        	{
        		System.out.print(result[index][i]+" ");
        	}
        	System.out.println();
        }
	}
}