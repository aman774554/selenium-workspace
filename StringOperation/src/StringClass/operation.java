package StringClass;
public class operation {
	public String conca(String one, String two)
	{
		System.out.println(one+" and "+two+"--> "+one.concat(two));
		return one.concat(two);
	}
	public boolean comp(String one, String two)
	{
		if (one.equals(two)==true)
		System.out.println(one+" and "+two+" are equal");
		else 
		System.out.println(one+" and "+two+" are not equal");
		return one.equals(two);
	}
	public String loww(String one)
	{
		System.out.println(one+"-->"+one.toLowerCase()+"(LowerCase)");
		return one.toLowerCase();
	}
	public int len(String one)
	{
		System.out.println("Length of "+one+"--> "+one.length());
		return one.length();
	}
	public boolean emp(String one)
	{
		if(one.isEmpty()==true)
			System.out.println("Empty");
		else
			System.out.println("Not Empty");
		return one.isEmpty();
	}	
}
