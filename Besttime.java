package java_project;
import java.util.*;
public class Besttime {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	    int profit=0;
	    for(int i=0; i<arr.length-1; i++)
	    {
	        for(int j=i+1; j<arr.length; j++)
	        {
	            if(arr[j]-arr[i]>profit)
	                profit = arr[j]-arr[i];
	        }
	    }
	    System.out.println(profit);
	}

}
