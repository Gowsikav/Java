class TargetEqualsSum
{
	public static void main(String[] args) {
		int[] list={3,4,7,2,9};
		int target=10,sum=0;
		for(int index=0;index<list.length;index++)
		{
              sum+=list[index];
		}
		if(target==sum)
			System.out.println("Target is equal to sum of all elements");
		else 
			System.out.println("Target is not equal to sum of all elements");
	}
}