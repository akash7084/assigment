package java_project;
import java.util.*;
public class Subset {
	public static int solution(int[] arr,int n) {
		int sum = 0;
        for (int i = 0; i < n; ++i)
            sum |= arr[i];
     
        int ans = sum * (int)Math.pow(2, n-1);
       return ans;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=solution(arr,n);
		System.out.println(a);
	}

}
