package week;

public class day {
	public String swi(int n)
	{
        switch(n){
        case 0: 
            System.out.println("Sunday");
            return "Sunday";  
        case 1: 
            System.out.println("Monday");
            return "Monday";
        case 2: 
            System.out.println("Tuesday");
            return "Tuesday";
        case 3: 
            System.out.println("Wednesday");
            return "Wednesday";
        case 4: 
            System.out.println("Thursday");
            return "Thursday";
        case 5: 
            System.out.println("Friday");
            return "Friday";
        case 6: 
            System.out.println("Saturday");
            return "Saturday";                 
        default:
            System.out.println("Invalid");
            return "Invalid";                  
        	}
	}

}
