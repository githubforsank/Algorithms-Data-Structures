package sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* Author : Sasank Sekhar Panda
 * Date : 05th June 2016
 * Time Complexity Analysis :
 * Best Case : O(n)
 * Average Case: O(n^2)
 * Worst Case: O(n^2)
 */
public class Insertion {
	Insertion(int array[],int n)
	{
		System.out.println("\n Array before Sorting :\n");
		display(array,n);
		InsertionSort(array,n);
		System.out.println("\n Array after Sorting : \n");
		display(array,n);
	}
	private void display(int array[],int n)
	{
		/*for(int i=0;i<n;i++)
			System.out.print(array[i]+" ");
		System.out.println();*/					//Naive Method
		System.out.println(Arrays.toString(array));//Better Method
	}
	private void InsertionSort(int array[],int n)
	{
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++)
			{
				if(array[j]>=array[i]){
					int temp=array[i];
					int k=i;
					while(k>j)
					{
						array[k]=array[k-1];
						k--;
					}
					array[j]=temp;
					break;
				}
				
			}
			
		}
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n=Integer.parseInt(ob.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=src.nextInt();
		}
		Insertion ins=new Insertion(array,n);
		src.close();
		ob.close();
		
	}
}
