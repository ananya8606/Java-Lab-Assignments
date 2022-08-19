package Lab2;
import java.util.*;
public class Exercise2 {
	int n;
    String[] a;
	Exercise2(int n){
		this.n=n;
	}
	String[] sortStrings(String[] a)
	{
		Arrays.sort(a);
		if(n%2==0)
		{
		for(int i=0;i<n/2;i++)
		a[i]=a[i].toUpperCase();
		for(int i=n/2;i<n;i++)
		a[i]=a[i].toLowerCase();
		}
		else
		{
		for(int i=0;i<n/2+1;i++)
		a[i]=a[i].toUpperCase();
		for(int i=n/2+1;i<n;i++)
		a[i]=a[i].toLowerCase();
		}
		return a;
 
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String[] arr=new String[n];
	 for(int i=0;i<n;i++)
	 {
	 arr[i]=sc.next();
	 }
	 Exercise2 a=new Exercise2(n);
	 String[] s=a.sortStrings(arr);
	 for(int i=0;i<n;i++)
	 System.out.print(s[i]+" ");
	 sc.close();
	}
}