package Lab3;
import java.util.*;
public class Exercise1 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s=0;
String st=sc.nextLine();
StringTokenizer str=new StringTokenizer(st," ");
while(str.hasMoreTokens())
{
int k=Integer.parseInt(str.nextToken());
s = s + k;
System.out.print(k+" ");
}
System.out.println(s);
sc.close();
}
}
