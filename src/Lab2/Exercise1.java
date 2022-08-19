package Lab2;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise1 {
	int n;
	int[] a;
	Exercise1(int n){
		this.n=n;
	}
	int getSecondSmallest(int[] a)
	{
		Arrays.sort(a);
		return a[1];
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
	 Exercise1 a=new Exercise1(n);
	 int s=a.getSecondSmallest(arr);
	 System.out.println(s);
	 sc.close();
	}
}