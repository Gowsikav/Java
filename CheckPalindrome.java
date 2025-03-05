class CheckPalindrome
{
    static int number=1221;
    static int num=number;
	static void palindrome()
	{
		int rev=0;
		while(number>0)
		{
           rev=rev*10+(number%10);
           number/=10;
		}
		if(rev==num)
		{
			System.out.println(num+" is Palindrome");
		}
		else 
			System.out.println(num+" is not Palindrome");
        
	}
	public static void main(String[] args) {
		palindrome();
	}
}