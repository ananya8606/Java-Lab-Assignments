package Lab1;
import java.util.*;
public class Exercise3 {
	int n;
	Exercise3(int n){
		this.n=n;
	}
	boolean checkNumber(int n)
	{
		int[] a=new int[n];
		a[0]=n%10;
		n=n/10;
		 for(int i=1;i<n;i++)
		 {
		 a[i]=n%10;
		 if(a[i]>a[i-1])
	     return false;
		 n=n/10;
		 }
		 return true;
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 Exercise3 a=new Exercise3(n);
	 boolean s=a.checkNumber(n);
	 System.out.println(s);
	 sc.close();
	}
}
