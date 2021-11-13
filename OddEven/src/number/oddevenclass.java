package number;

import java.util.Scanner;

public class oddevenclass {
	
	Scanner sc= new Scanner(System.in);
	public int in()
	{
		System.out.println("enter any number");
		return sc.nextInt();
	}
	
	public String oe(int num)
	{
		if(num % 2 == 0)
		{
            System.out.println(num + " is even");
		    return "even";
		}
        else
        {
            System.out.println(num + " is odd");
			return "odd";
	}
	}
}
