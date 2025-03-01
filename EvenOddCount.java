class EvenOddCount
{
	public static void main(String[] args) {
		
		int[] list={3,56,2,76,45,24,57,29,65};
		int evenCount=0,oddCount=0;
		for(int index=0;index<list.length;index++)
		{
			if(list[index]%2==0)
				evenCount++;
			else 
				oddCount++;
		}
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd Count: "+oddCount);
	}
}