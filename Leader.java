package java_project;
import java.util.*;
public class Leader {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int arr[]= new int[n];
    	 for(int i=0;i<n;i++)
    	 {
    		 arr[i]=sc.nextInt();
    	 }
    	 for(int i=0;i<n;i++)
    	 {
    		 boolean flag=false;
    		for(int j=i+1;j<n;j++)
    		{
    			if(arr[i]<=arr[j])
    			{
    				flag=true;
    				break;
    			}
    		}
    		if(flag==false)
        	{
        		System.out.print(arr[i]+" ");
        	}
        	 
    	 }
    	
     }
}
