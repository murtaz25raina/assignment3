import java.util.*;
public class Armstrong{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int size=String.valueOf(num).length();
		double rem=0,sum=0,temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+Math.pow(rem,size);
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Yes, it's an Armstrong number");
		else
			System.out.println("No, it's not an Armstrong number");
        
	}

}