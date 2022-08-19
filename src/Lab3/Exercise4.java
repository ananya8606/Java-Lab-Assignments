package Lab3;
import java.util.Scanner;
public class Exercise4 {
	int n;
	Exercise4(int n){
		this.n=n;
	}
	String modifyNumber(int n)
	{
	String s=Integer.toString(n);
	String t="";
	for(int i=1;i<s.length();i++)
	{
	t=t+((s.charAt(i-1)>s.charAt(i))?(s.charAt(i-1)-s.charAt(i)):(-s.charAt(i-1)+s.charAt(i)));
	}
	t=t+s.charAt(s.length()-1);
	return t;
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 Exercise4 a=new Exercise4(n);
	 String s=a.modifyNumber(n);
	 System.out.println(s);
	 sc.close();
	}
}