package sorting_searching;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
/* Author : Sasank Sekhar Panda
 * Date : 06th June 2016, 12:05 AM
 * Time complexity analysis :
 * Best Case :
 * Average Case :
 * Worst Case :
 */


public class Merge {
	Merge(int array[],int n)
	{
		System.out.println("The array before sorting ");
		display(array,n);
		merge_sort(array,0,n-1);
		System.out.println("The array after sorting ");
		display(array,n);
	}
	private void display(int array[],int n)
	{
		System.out.println(Arrays.toString(array));
	}
	private void merge_sort(int array[],int p,int q)
	{
		if(p<q){
			int mid=(p+q)/2;
			merge_sort(array,p,mid);
			merge_sort(array,mid+1,q);
			merge(array,p,mid,q);
		}
	}
	private void merge(int arr[], int l, int m, int r)
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	 
	    /* create temp arrays */
	    int L[]=new int[n1], R[]=new int[n2];
	 
	    /* Copy data to temp arrays L[] and R[] */
	    for (i = 0; i < n1; i++)
	        L[i] = arr[l + i];
	    for (j = 0; j < n2; j++)
	        R[j] = arr[m + 1+ j];
	 
	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0; // Initial index of first subarray
	    j = 0; // Initial index of second subarray
	    k = l; // Initial index of merged subarray
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            arr[k] = L[i];
	            i++;
	        }
	        else
	        {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    /* Copy the remaining elements of L[], if there
	       are any */
	    while (i < n1)
	    {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there
	       are any */
	    while (j < n2)
	    {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
	 
	public static void main(String args[]) throws IOException
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the no of elements to be entered");
		int n=Integer.parseInt(ob.readLine());
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scr.nextInt();
		}
		Merge merge=new Merge(array,n);
		scr.close();
		ob.close();
	}

}
