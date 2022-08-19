package Lab3;
import java.util.*;
public class Exercise3 {
	String s;
	Exercise3(String s){
		this.s=s;
	}
	String alterString(String s)
	{
	String f="";
	char ch1='a';
	char ch2='e';
	char ch3='i';
	char ch4='o';
	char ch5='u';
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)==ch1|| s.charAt(i)==ch2||s.charAt(i)==ch3||s.charAt(i)==ch4||s.charAt(i)==ch5||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
	f=f+s.charAt(i);
	else
	f=f+(char)(s.charAt(i)+'b'-'a');
	}
	return f;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	 String str=sc.nextLine();
	 Exercise3 a=new Exercise3(str);
	 String j=a.alterString(str);
	 System.out.println(j);
	 sc.close();
	}
}