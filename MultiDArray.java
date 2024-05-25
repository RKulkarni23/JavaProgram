package testing;

public class MultiDArray {

	public static void main(StringDemo1[] args) {
		
		
		int a[][]=new int[2][2];
		a[0][0]=60;
		a[0][1]=50;
		a[1][0]=40;
		a[1][1]=30;

		System.out.print(a[1][1]);
		System.out.println(a[1][0]);
		System.out.print(a[0][1]);
		System.out.println(a[0][0]);
		
		System.out.println("----------------------------------------------------------------");
		
		for (int i[]:a)
		{
			for(int j:i)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		} 
		System.out.println("----------------------------------------------------------------");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]);
			}
			System.out.println();
		}	
		}}