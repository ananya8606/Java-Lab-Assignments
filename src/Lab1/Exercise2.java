package Lab1;
import java.util.*;
import java.lang.Math;
public class Exercise2 {
	int n;
	Exercise2(int n){
		this.n=n;
	}
	int calculateDifference(int n)
	{
    int sum=0;
	for(int i=1;i<=n;i++)
	{
	sum=sum+i*i;	
	}
	return sum-(int)Math.pow((n*n+n)/2,2);
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 Exercise2 a=new Exercise2(n);
	 int s=a.calculateDifference(n);
	 System.out.println(s);
	 sc.close();
	}
}
