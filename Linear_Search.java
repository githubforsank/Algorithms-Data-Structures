package sorting_searching;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Linear_Search {
	Linear_Search() throws NumberFormatException, IOException
	{
		System.out.println("Enter the no of elements");
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(ob.readLine());
		int array[]=new int[n];
		Random r=new Random();
		//..........Random No generator for java ..............//
		
		for(int i=0;i<n;i++)
		{
			array[i]=Math.abs(r.nextInt())%100;
		}
		System.out.println("Randomly entered array :");
		display(array);
		System.out.println("Enter the no to be searched ");
		int element=Integer.parseInt(ob.readLine());
		linear_search(array,n,element);
	}
		private void linear_search(int array[],int n,int element)
		{
			int flag=0;
			for(int i=0;i<n;i++)
			{
				if(array[i]==element){
					System.out.println("Element found at : "+(i+1));
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Element not found !!! ");
			}
	}
		
	
	
	private void display(int array[])
	{
		System.out.println(Arrays.toString(array));
	}
	public static void main(String args[]) throws IOException
	{
		Linear_Search lsr=new Linear_Search();
	}
}
