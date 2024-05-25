package testing;

public class Array {

	public static void main(StringDemo1[] args) {
		//store similar type of data ,  index start with 0 
		//static - fixed
		//int a[] =new int[2]  -------syntax
		
		int a[]=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//a[-1]=5; //error
		System.out.println(""+a[0]);
		System.out.println(""+a[1]);
		System.out.println(""+a[2]);
		//System.out.println(""+a[-1]);
		
		System.out.println("*********************************");
		
		//
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}
			
		System.out.println("*********************************");
		
//		StringDemo c[]=new StringDemo[4];
//		c[0]="Satara";
//		c[1]="sangli";
//		c[2]="kolhapur";
//		c[3]="Pune";
//		
//		for(int i=0;i<=2;i++)
//		{
//			System.out.println(c[i]);
//		}
		
		System.out.println("*********************************");
		
		double d[]=new double[3];
		d[0]=3.4;
		d[1]=1.2;
		d[2]=4.5;
		
		//System.out.println(d[1]);
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(d[i]);
		}
		
		//printing in same line 
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		
		System.out.println("----------------------------------------------------------------");
		
		int j[]= {1,2,3,4,5};
		//System.out.println(j[3]);
		System.out.println("length of array = "+j.length);
		
//		for(int k=0;k<=4;k++)
//		{
//			System.out.println(j[k]);
//		}
		for(int k=4;k>=0;k--)
		{
			System.out.println(j[k]);
		}
		
		System.out.println("-----------------------------------------------------------------");
		//declare array and use length as .length 
	//	StringDemo l[]= {"revati","sonali","rushikesh","sagar"};
		
//		for(int m=0;m<l.length;m++)
//		{
//			System.out.println(l[m]);
//		}
		
	}}
