package Numbers;
import java.util.*;
public class program1 {
	int n = 123456, even = 0, odd = 0;
	{
	while(n > 0){
	    int d = n % 10;
	    if(d % 2 == 0) even++;
	    else odd++;
	    n /= 10;
	}
	System.out.println("Even=" + even + " Odd=" + odd);

	}}
