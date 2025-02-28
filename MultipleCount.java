class MultipleCount
{
	public static void main(String[] args) {
		
		int[] list={3,89,56,37,89,99,44,50};
		int target=3,count=0;
		for(int index=0;index<list.length;index++)
		{
			if(list[index]%target==0)
				count++;
		}
		System.out.println("No of elements multiple in target is "+count);

	}
}