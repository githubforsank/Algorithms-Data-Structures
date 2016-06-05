package sorting_searching;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.InputStreamReader;
/* Author : Sasank Sekhar Panda
 * Date : 05th June 2016, 11:48 PM
 * Time Complexitiy analysis :
 * Best Case :
 * Average Case :
 */
public class Selection {
	Selection(int array[],int n)
	{
		System.out.println("Array Before Sorting :");
		display(array,n);
		Selection_Sort(array,n);
		System.out.println("Array After Sorting");
		display(array,n);
	}
	private void display(int array[],int n)
	{
		System.out.println(Arrays.toString(array));
	}
	private void Selection_Sort(int array[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int min=array[i];
			int index=i;
			for(int j=i+1;j<n;j++)
			{
				if(min>array[j]){
					min=array[j];
					index=j;
				}
			}
			int temp=array[i];
			array[i]=min;
			array[index]=temp;
		}
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the no of array elements \n");
		int n=Integer.parseInt(ob.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scr.nextInt();
		}
		Selection sel=new Selection(array,n);
		
	}
}
