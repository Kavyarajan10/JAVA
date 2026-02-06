package Numbers;
import java.util.Scanner;
public class program2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        int digit;
	        while (num > 0) {
	            digit = num % 10;   // extract last digit
	            sum = sum + digit; // add digit to sum
	            num = num / 10;    // remove last digit
	        }
	        System.out.println("Sum of digits = " + sum);
	    }
	}


