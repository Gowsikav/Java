class AverageArray{
	
	public static void main(String[] args) {
		int[] list={3,6,28,57,1,7};
		int sum=0,avg;
		for(int index=0;index<list.length;index++)
			sum+=list[index];
		avg=sum/list.length;
		System.out.println("Average of array: "+avg);
		
	}
}