package vowel;
public class vowelClass {
	
public int findvowel(String str)
{
	int n=0,i;
	char ch;
	for(i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			n++;
		}
	}
	
	System.out.println(n);
	return n;
}
}
