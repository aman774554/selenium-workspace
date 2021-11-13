package month;

public class mon {
	
	public String swi(int n)
	{   
		switch(n){ 
        case 1: 
            System.out.println("January");
            return "January";
        case 2: 
            System.out.println("February");
            return "February";
        case 3: 
            System.out.println("March");
            return "March";
        case 4: 
            System.out.println("April");
            return "April";
        case 5: 
            System.out.println("May");
            return "May";
        case 6: 
            System.out.println("June");
            return "June";  
        case 7: 
            System.out.println("July");
            return "July";
        case 8: 
            System.out.println("August");
            return "August";
        case 9: 
            System.out.println("September");
            return "September";
        case 10: 
            System.out.println("October");
            return "October";
        case 11: 
            System.out.println("November");
            return "November";
        case 12: 
            System.out.println("December");
            return "December";             
        default:
            System.out.println("Invalid");
            return "Invalid";                  
        	}
	}
}
