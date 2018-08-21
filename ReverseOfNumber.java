import java.util.*;
public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
	    int reverse=0,rem;
	    while(num>0)
	    {
	    	rem=num%10;
	    	reverse=reverse*10+rem;
	    	num=num/10;
	    }
	    System.out.println(reverse);
		input.close();
	}

}
