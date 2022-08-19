package Lab1;
import java.util.Scanner;
public class Exercise4 {
	int n;
	Exercise4(int n){
		this.n=n;
	}
	boolean checkNumber(int n)
	{
		if((n & 1)== 0)
		return true;
		else
		return false;
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 Exercise4 a=new Exercise4(n);
	 boolean s=a.checkNumber(n);
	 System.out.println(s);
	 sc.close();
	}
}