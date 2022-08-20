package doSelectPracticeAssessment;
import java.util.*;
class Activity{
	  //Implement Activity class here..
	  String s1;
	  String s2;
	  String op;
	  Activity(String s1,String s2,String op)
	  {
	    this.s1=s1;
	    this.s2=s2;
	    this.op=op;
	  }
	}



	public class Source2 {
	  //Implement the two function given in description in here...
	  public String handleException(Activity  a){
	     String s=a.s1;
	     String s1=a.s2;
	     try{
	     if(s==null || s1==null){ 
	     return "Null values found";
	     }}
	     catch(NullPointerException e){
	       e.printStackTrace();
	     }
	     try{
	     if(a.op.equals("+")==false && a.op.equals("-")==false)
	     {
	      return a.op; 
	      }}
	      catch(Exception e){
	        e.printStackTrace();
	      }
	      return "No Exception Found";
	     }
	  public String doOperation(Activity a){
	   switch(a.op){
	     case "+": a.s1=a.s1.concat(a.s2);
	               break;
	    case "-":a.s1=a.s1.replaceAll(a.s2,"");
	              break;
	   }
	   return a.s1;
	  }
		public static void main(String args[] ) throws Exception {
	    //Write your own main to check the program...
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    String o=sc.nextLine();
	    Activity a=new Activity(s1,s2,o);
	    Source2 s=new Source2();
	    String b=s.handleException(a);
	    String c=s.doOperation(a);
	    System.out.println(b);
	     System.out.println(c);
	     sc.close();
		}
	}
