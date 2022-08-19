package Lab3;
import java.util.*;
public class Exercise8 {
boolean ispositive(String st)
{
	int c=0;
	for(int i=1;i<st.length();i++)
	{
	if(st.charAt(i)-st.charAt(i-1)>=0)
	c++;
	}
	if(c==st.length()-1)
	return true;
	else
	return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
Exercise8 f=new Exercise8();
boolean d=f.ispositive(st);
System.out.println(d);
sc.close();
}
}