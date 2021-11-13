package primeNum;

public class pri {
	/*Scanner sc=new Scanner (System.in);
	public int input()
	{
	System.out.println("Enter the number");
	return sc.nextInt();
	}
	*/

	public String prim(int n)
	{
	//int m = 0,flag=0, i=2;
	/*if(n<2)
	flag=1;

	else if(n==2)
	flag=0;
	else
	m=n/2;
	for(i=2;i<m;i++)
	{
	if(n%i==0)
	{
	flag=1;
	break;

	}

	}
	if(flag==1)
	return "Not Prime";
	else
	return "Prime";*/



	/*while(i<=n/2)
	{
	if(n%i==0)
	{
	System.out.println("Not Prime");
	flag=1;
	break;
	}

	i++;
	}
	if(flag==1)

	return "Not Prime";

	else
	System.out.println("Prime");
	return "Prime";*/

	int i,p=0;

	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	p++;
	}
	}

	if(p==2)

	return "Prime";
	else
	return "Not Prime";

	}
}
