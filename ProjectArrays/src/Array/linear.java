package Array;

import java.util.Scanner;

public class linear {
	
	public static int linear1(int arr[])
	{
		int c=0,pos=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
			c=1;
			pos=i+1;
			break;
		}
		
	}
	
	if (c==0)
	{
		return 0;
	}
	else
	{
		return pos;
	}
	
	}
	
}
