package minimumIfElse;
public class min {
	public int findmin(int a,int b,int c,int d, int e)
	{
		if(a<=b && a<=c && a<=d && a<=e)
		{
			System.out.println(a);
			return a;
		}
		
		else if(b<=a && b<=c && b<=d && b<=e)
		{
			System.out.println(b);
			return b;
		}
		else if(c<=a && c<=b && c<=d && c<=e)
		{
			System.out.println(c);
			return c;
		}
		else if(d<=a && d<=b && d<=c && d<=e)
		{
			System.out.println(d);
			return d;
		}
		else
		{
			System.out.println(e);
			return e;
		}
		
	}
}
