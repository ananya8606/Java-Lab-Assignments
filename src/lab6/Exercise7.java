package lab6;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise7 {
	int[] getSorted(int[] a)
	{
		for(int i=0;i<a.length;i++)
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
	 Exercise7 a=new Exercise7();
	 int[] s=a.getSorted(arr);
	 for(int i=0;i<n;i++)
	 System.out.print(s[i]+" ");
	 sc.close();
	}
}
