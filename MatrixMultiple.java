class MatrixMultiple
{
	public static void main(String[] args) {
		
		int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};

        int[][] product = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i <matrixA.length ; i++) 
        {
            for (int j = 0; j < matrixB.length; j++)
             {
                for (int k = 0; k < matrixB[0].length; k++)
                 {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
          
        System.out.println("Matrix Multiplication");	
        for(int index=0;index<product.length;index++)
        {
        	for(int i=0;i<product[index].length;i++)
        		System.out.print(product[index][i]+" ");
        	System.out.println();
        }
	}
}