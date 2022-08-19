package Lab2;
import java.util.*;
public class Exercise3 {
	int n;
    int[] a;
	Exercise3(int n){
		this.n=n;
	}
	int[] getSorted(int[] a)
	{
		for(int i=0;i<n;i++)
		{
		int k=a[i],d=0,r=0;
	    while(k>0)
	    {
	    d=k%10;
	    r=r*10+d;
	    k=k/10;
	    }
	    a[i]=r;
		}
		Arrays.sort(a);
		return a;
 
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++)
	 {
	 arr[i]=sc.nextInt();
	 }
	 Exercise3 a=new Exercise3(n);
	 int[] s=a.getSorted(arr);
	 for(int i=0;i<n;i++)
	 System.out.print(s[i]+" ");
	 sc.close();
	}
}
