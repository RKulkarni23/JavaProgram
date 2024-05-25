package testing;

public class Swapping {

	public static void main(StringDemo1[] args) {
		
		//with three variables
		int a=20,b=10;
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("using three variables");
		System.out.println("a=" +a + "  b="+b);

		//with two variables
		int d=10,e=20;
		
		
		d=d+e ; //d=30
		e=d-e; //e=20
	    d=d-e;//d=10
		
		

		System.out.println("using only two variables");
		System.out.println("d=" +d + "  e=" +e);
		
		
		
	}

}
