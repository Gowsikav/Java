class SetZeros
{
	public static void main(String[] args) {

		int[][] number = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        boolean[] row = new boolean[number.length];
        boolean[] col = new boolean[number[0].length];

        for (int i = 0; i < number.length; i++)
         {
            for (int j = 0; j < number[0].length; j++) 
            {
                if (number[i][j] == 0) 
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < number.length; i++) 
        {
            for (int j = 0; j < number[0].length; j++) 
            {
                if (row[i] || col[j]) 
                {
                    number[i][j] = 0;
                }
            }
        }

        for(int index=0;index<number.length;index++)
        {
        	for(int i=0;i<number[index].length;i++)
        		System.out.print(number[index][i]+" ");
        	System.out.println();
        }

    }
	
}

