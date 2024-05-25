package testing;

public class ReverseNumber {

	public static void main(StringDemo1[] args) {
		
		//number reversing
		
		int a=1331;  //store
		int sum=0,rem; //initialize 
		int b=a;
		
		while(a>0) // min no is 0 we can compare
		{
			rem=a%10;   //reminder store - rem
			a=a/10; 	 
			sum=sum *10+rem;  
		}
			System.out.println("" +sum );
			
		//palindrome 
			
			if(b==sum)
			{
				System.out.println("palindrome number");
			}
			else
			{
				System.out.println("not a palindrome number");
			}
	}
}
