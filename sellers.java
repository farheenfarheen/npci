package javapractise;

public  class seller1 {
	
	 
		  int iphone=1200;
			int samsung=1000;
			int redmi=900;
			int other=500;
	 
	  
}
//seller2



public  class seller2 extends seller1 {

	int iphone2=1100;
	int samsung2=1200;
	int redmi2=800;
	int other2=700;
}
//products


import java.util.Scanner;

public class product1  extends seller2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char c=' ';
		//seller1 s1=new seller1();
		seller2 s2=new seller2();
		do {
			System.out.println("\n enter products which you want \n 1.iphone12  \n 2.samsung \n 3.redmi \n 4.other");
			int ch=sc.nextInt();
		if(ch==1)
		{
			
			if(s2.iphone<s2.iphone2)
			{
				System.out.println("seller one has cheapest product");
			}
			else
			{
				System.out.println("seller two has cheapest product");
			}
		}
		else if(ch==2)
		{
			
			if(s2.samsung<s2.samsung2)
			{
				System.out.println("seller one has cheapest product");
			}
			else
			{
				System.out.println("seller two has cheapest product");
			}
		}
		else if(ch==3)
		{
			
			if(s2.redmi<s2.redmi2)
			{
				System.out.println("seller one has cheapest product");
			}
			else
			{
				System.out.println("seller two has cheapest product");
			}
		}
		else if(ch==4)
		{
			
			if(s2.other<s2.other2)
			{
				System.out.println("seller one has cheapest product");
			}
			else
			{
				System.out.println("seller two has cheapest product");
			}
		}
		else
		{
			System.out.print("invalid product");
		}
		System.out.print("to search more enter y");
		c=sc.next().charAt(0);
		}while(c=='y' ||c=='Y');
		sc.close();
	}

}
