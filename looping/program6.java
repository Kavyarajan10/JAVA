package looping;
import java.util.Scanner;
public class program6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            int num = sc.nextInt();
	            int fact = 1;

	            for (int j = 1; j <= num; j++) {
	                fact = fact * j;
	            }
	            sum = sum + fact;
	        }
	        System.out.println(sum);
	    }
	}
