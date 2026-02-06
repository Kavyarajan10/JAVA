package conditional;
import java.util.Scanner;
public class program2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        int max;
	        if (a > b && a > c && a > d)
	            max = a;
	        else if (b > c && b > d)
	            max = b;
	        else if (c > d)
	            max = c;
	        else
	            max = d;
	        System.out.println("Maximum: " + max);
	    }
	}


