class FindTargetByCombine
{
	public static void main(String[] args) {
		
		int[] list={2,4,10,90,4,6};
		int target=8;
		for(int index=0;index<list.length;index++)
		{
			for(int secIndex=index+1;secIndex<list.length;secIndex++)
			{
				if((list[index]+list[secIndex])==target)
					System.out.println("["+list[index]+","+list[secIndex]+"]");
			}
		}
	}
	
}