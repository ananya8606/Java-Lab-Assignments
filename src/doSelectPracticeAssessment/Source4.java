package doSelectPracticeAssessment;
import java.util.*;
import java.util.regex.*;
class Header{
	// Implemet the Header Class according to the specifiaction.
	String from;
	String to;
	Header(String from,String to)
	{
	this.from=from;
	this.to=to;
	}
	}
	class Email{
	// Implement Email Class according to the specifiaction.
	Header header;
	String body;
	String greetings;
	Email(Header header,String body,String greetings){
		this.header=header;
		this.body=body;
		this.greetings=greetings;
	}
	}
	class EmailOperations{
	// Implemet the Three methods specified in the specified.	
	public int emailVerify(Email e){
		String to=e.header.to;
		String from=e.header.from;
		String pattern="^([a-z]|[A-Z]|_)([a-z]|[A-Z])*@([a-z]|[A-Z])([a-z]|[A-Z])*.([a-z]|[A-Z])([a-z]|[A-Z])*$";
	Pattern p=Pattern.compile(pattern);
	Matcher m=p.matcher(to);
	Matcher m1=p.matcher(from);
	if(m.matches() && m1.matches())
	return 2;
	else if(m.matches()||m1.matches())
	return 1;
	else 
	return 0;
	}
	public String bodyEncryption(Email e){
	String s=e.body;
	String b="";
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==' ')
		b=b+s.charAt(i);
		else if((s.charAt(i)>'W'&& s.charAt(i)<='Z')||(s.charAt(i)>'w'&& s.charAt(i)<='z'))
		 b=b+(char)(s.charAt(i)-23);
		else if(s.charAt(i)<='W'||s.charAt(i)<='w')
	    b=b+(char)(s.charAt(i)+3);
		}
		return b;
	}
	public String greetingMessage(Email e){
	String a=e.header.from;
	String v=e.greetings;
	String b="";
	for(int i=0;i<a.length();i++)
	{
	if(a.charAt(i)=='@')
	break;
	b=b+a.charAt(i);
	}
	return v+" "+b;
	}
	}


	public class Source4 {
		public static void main(String args[] ) throws Exception {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	    // You can Implement your main() to check your Program.
	    Scanner sc=new Scanner(System.in);
		String to=sc.nextLine();
		String from=sc.nextLine();
		String body=sc.nextLine();
		String greetings=sc.nextLine();
		Header h=new Header(from,to);
	    Email e=new Email(h,body,greetings);
		EmailOperations e1=new EmailOperations();
		int k=e1.emailVerify(e);
		String b=e1.bodyEncryption(e);
		String s=e1.greetingMessage(e);
		System.out.println(k);
		System.out.println(b);
		System.out.println(s);
		sc.close();
		}
	}