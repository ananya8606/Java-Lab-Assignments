package Lab1;
import java.util.*;
public class Exercise1 {
	int n;
	Exercise1(int n){
		this.n=n;
	}
	int calculateSum(int n)
	{
    int sum=0;
	for(int i=1;i<=n;i++)
	{
	if(i%3==0||i%5==0)
	sum=sum+i;	
	}
	return sum;
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 Exercise1 a=new Exercise1(n);
	 int s=a.calculateSum(n);
	 System.out.println(s);
	 sc.close();
	}
}
