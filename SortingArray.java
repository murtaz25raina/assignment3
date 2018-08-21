import java.util.*;
public class SortingArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		int temp=0;
		for(int i=0;i<10;i++){
		arr[i]=input.nextInt();}
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
		input.close();
	}

}
