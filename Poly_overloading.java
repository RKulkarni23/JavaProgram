package testing;
//						POLYMORPHISM
//same name diff behavior // eg payment and self 
//same name diff no.parameters/signature

//overloading
class Payment
	{
	public void Money(int a)
	{
		System.out.println("first method = "+a);
	}
	
	public void Money(int a,int b)
	{
		System.out.println("second method ="+a +" " +b);
	}
	
	}

public class Poly_overloading 
{

	public static void main(String[] args) 
	{
		
		Payment py=new Payment();
		py.Money(10);
		py.Money(20, 30);

	}

}
