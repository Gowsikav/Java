class EncodeDigits
{
	public static void main(String[] args) {
		long number=9342255407l;
		long d,rev=0;
		String ans="",word="";
		while(number>0)
		{
			d=number%10;
			number/=10;
			if(d==0)
				word="Hello";
			else if(d==1)
				word="Bye";
			else if(d==2)
				word="Class";
			else if(d==3)
				word="Pen";
			else if(d==4)
				word="Pencil";
			else if(d==5)
				word="Laptop";
			else if(d==6)
				word="Chair";
			else if(d==7)
				word="World";
			else if(d==8)
				word="Beauty";
			else if(d==9)
				word="Bag";

			System.out.println(d+": "+word);
            ans+=word+" ";

		}
		System.out.println(ans); 

		
		}
}