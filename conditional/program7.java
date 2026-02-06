package conditional;
import java.util.Scanner;
public class program7 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int day = sc.nextInt();
	        int month = sc.nextInt();
	        int year = sc.nextInt();
	        boolean valid = true;
	        if (month < 1 || month > 12)
	            valid = false;
	        else {
	            if (month == 2) {
	                boolean leap = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	                if (leap && day > 29) valid = false;
	                else if (!leap && day > 28) valid = false;
	            }
	            else if (month == 4 || month == 6 || month == 9 || month == 11) {
	                if (day > 30) valid = false;
	            }
	            else {
	                if (day > 31) valid = false;
	            }
	        }
	        if (valid)
	            System.out.println("Valid Date");
	        else
	            System.out.println("Invalid Date");
	    }
	}


