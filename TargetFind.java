class TargetFind
{
	public static void main(String[] args) {
		
		int[] list={3,6,2,67,45,98,39};
		int target=45,index=0;
		for(index=0;index<list.length;index++)
		{
			if(target==list[index])
			{
				System.out.println("Target found at index "+index);
				break;
			}
		}
		if(index==list.length)
		{
			System.out.println("Target not found");
		}
	}
	
}