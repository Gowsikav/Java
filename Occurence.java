class Occurence
{
	public static void main(String[] args) {
		
		long number=6378296392l;
		int[] arr=new int[10];
		long d;
		while(number>0)
		{
			d=number%10;
			number/=10;
			arr[(int)d]++;
		}
		for(int i=0;i<10;i++)
			System.out.println(i+": "+arr[i]);

	}
}