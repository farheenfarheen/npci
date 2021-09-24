package collections;

import java.util.Scanner;

public class customermain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		customer c=new customer();
		
		int n=0;
		do {
			System.out.println("enter which item you want to add \n 1.iphone \n 2.Refridgerator \n 3.Washing Machine \n 4.Kurthi");
			int ch=sc.nextInt();
			
		if(ch==1)
		{
			c.iphone();
		}
		else if(ch==2)
		{
			c.Refridgerator();
		}
		else if(ch==3)
		{
			c.washingmachine();
		}
		else
		{
			c.kurthi();
		}
		System.out.println("\n enter 4 to exit");
		n=sc.nextInt();
		}while(n!=4);
	}

}

//customer class
//package collections;

public class customer {
	int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;
	public void iphone()
	{
		
		count1++;
		System.out.println(count1+"items of  iphone is succesfully added");
	}
	public void Refridgerator()
	{
		
		count2++;
		System.out.println(count2+"items of Refridgerator is succesfully added");
	}
	public void washingmachine()
	{
		
		count3++;
		System.out.println(count3+"items of Washing machine  is succesfully added");
	}
	public void kurthi()
	{
		
		count4++;
		System.out.println(count4+"items of kurthi  is succesfully added");
	}

}
