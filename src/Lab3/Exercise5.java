package Lab3;
import java.util.*;
public class Exercise5 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s=0,s1=0,c=0;
String st="";
while(sc.hasNextLine())
{
String f=sc.nextLine();
st=st+" "+f;
if(f==null||f.isEmpty()) {
	break;
}
++s1;
}
for(int i=0;i<st.length();i++)
{
if(Character.isWhitespace(st.charAt(i))==false)
c++;
}
StringTokenizer str=new StringTokenizer(st," ");
while(str.hasMoreTokens())
{
s++;
str.nextToken();
}
System.out.println(st);
System.out.println("No. of words are:"+s);
System.out.println("No. of characters are:"+c);
System.out.println("No. of lines are:"+s1);
sc.close();
}
}