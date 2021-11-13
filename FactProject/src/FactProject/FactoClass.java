package FactProject;

import java.util.Scanner;

public class FactoClass {
	Scanner sc= new Scanner(System.in);
	public int input()
	{
		System.out.println("enter any number");
		return sc.nextInt();
	}

	public int facto(int n)
	{
		int c,fact=1;
		for (c=1;c<=n;c++)
			fact = fact*c;
		return fact;
	}
}
