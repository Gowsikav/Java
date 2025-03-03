class MinAndMax
{
	public static void main(String[] args) {
		
		int[] list={3,67,2,8,56};
		int min=list[0],max=list[0];
		
		for(int num:list)
		{
			if(num<min)
				min=num;
			if(num>max)
				max=num;
		}

		System.out.println("Minimun Element: "+min+" Maximum Element: "+max);
	}

}