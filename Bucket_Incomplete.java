package sorting_searching;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
/* Author : Sasank Sekhar Panda
 * Date : 06th June 2016, 2:04 AM
 * Time complexity analysis :
 * Best Case :
 * Average Case :
 * Worst Case :
 */
class Node
{
	int a;
	Node next;
}
public class Bucket_Incomplete{
	Bucket_Incomplete(int array[],int n)
	{
		System.out.println("The array before sorting");
		display(array,n);
		bucket_sort(array,n);
		System.out.println("The array after sorting");
		display(array,n);
	}
	private void bucket_sort(int array[],int n)
	{
		//Any algorithm goes on here
	}
	private void display(int array[],int n)
	{
		System.out.println(Arrays.toString(array));
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array");
		int n=Integer.parseInt(ob.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scr.nextInt();
		Bucket_Incomplete bck=new Bucket_Incomplete(array,n);
		scr.close();
		ob.close();
	}

}
