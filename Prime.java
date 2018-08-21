import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int count=0,i,j;
		for(i=2;i<=num;i++)
		{
			if(i==2)
			{
				System.out.print(2 +" ");
			}
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count=1;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
			count=0;
		}
		input.close();
	}

}
