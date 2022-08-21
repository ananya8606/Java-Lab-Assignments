package lab6;
import java.util.*;
public class Exercise4 {
	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> o){
		HashMap<Integer,String> h=new HashMap<>();
		for(Map.Entry<Integer,Integer> m:o.entrySet()) {
			if(m.getValue()>=90) 
		     h.put(m.getKey(),"Gold");
			else if(m.getValue()>=70 && m.getValue()<80) 
				 h.put(m.getKey(),"Bronze");
			else if(m.getValue()>=80 && m.getValue()<90) 
				 h.put(m.getKey(),"Silver");
			}
		return h;
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
HashMap<Integer,Integer> h=new HashMap<>();
while(sc.hasNextInt()) {
int p=sc.nextInt();
int q=sc.nextInt();
h.put(p,q);
}
Exercise4 d=new Exercise4();
HashMap<Integer,String> g=d.getStudents(h);
System.out.println(g);
sc.close();
}
}