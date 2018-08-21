import java.util.*;
public class SearchingInArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
		arr[i]=input.nextInt();}
		int search,count=0;
		search=input.nextInt();
		for(int i=0;i<10;i++)
		{
			if(arr[i]==search)
				System.out.println("number found at "+i+"th position");
			else
				count++;
		}
		if(count==10)
		{
			System.out.println("Not found");
		}
		input.close();
	}

}
