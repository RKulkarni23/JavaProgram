package testing;

//overriding //same name same no.parameters/signature


	class School
	{
		public void student(String a)
		{
			System.out.println("Students 1 to 10" );
		}
	}
	class College extends School
	{
		public void student(String a)
		{
			System.out.println("Students 11 to 20");
		}
	}
	public class Poly_overriding 
	{
	public static void main(String[] args) 
	{
		
		College cl= new College(); //child
		cl.student("A");

		School sc=new School(); //parent
		sc.student("B");
		
		School sc1=new College(); //down casting is possible
		sc1.student("c");
		
	//up casting is not possible --> child to parent
		
		
	}

}
