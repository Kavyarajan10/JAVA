package String;
import java.util.Scanner;
public class program5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s1 = sc.nextLine();
	        String s2 = sc.nextLine();
	        int result = s1.compareTo(s2);
	        if (result == 0)
	            System.out.println("Equal");
	        else if (result < 0)
	            System.out.println(s1 + " < " + s2);
	        else
	            System.out.println(s1 + " > " + s2);
	    }
	}
