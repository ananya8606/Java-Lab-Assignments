package Lab3;
import java.util.*;
public class Exercise2 {
	String s;
	Exercise2(String s){
		this.s=s;
	}
	String getImage(String s)
	{
	return s+"|";
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	 String str=sc.nextLine();
	 StringBuffer b=new StringBuffer(str);
	 Exercise2 a=new Exercise2(str);
	 String j=a.getImage(str);
	 System.out.println(j+b.reverse());
	 sc.close();
	}
}