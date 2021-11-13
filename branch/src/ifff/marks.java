package ifff;

public class marks {

		public String mark(int a)
		{
			if(a>=90)
			{
				return "A";
			}
			
			else if(85<=a && a<90)
			{
				return "B";
			}
			else if(81<=a && a<85)
			{
				return "C";
			}
			else if(70<=a && a<81)
			{
				return "D";
			}
			else if(40<=a && a<70)
			{
				return "E";
			}	
			else
			{
				return "F";
			}
			
		}
		
	}


