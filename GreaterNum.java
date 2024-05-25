package testing;

public class GreaterNum {

	public static void main(StringDemo1[] args) {
		
		int a=10, b=20, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>c && b>a)
		{
			System.out.println("b is greater than a and c");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
