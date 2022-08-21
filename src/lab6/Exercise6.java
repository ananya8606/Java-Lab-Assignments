package lab6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Exercise6 {
	ArrayList<Integer> votersList(HashMap<Integer,Integer> h)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> m:h.entrySet()) {
			if(m.getValue()>=18)
			a.add(m.getKey());
			}
			return a;
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
HashMap<Integer,Integer> h=new HashMap<>();
while(sc.hasNextInt()) {
int p=sc.nextInt();
int q=sc.nextInt();
h.put(p,q);
}
Exercise6 d=new Exercise6();
ArrayList<Integer> g=d.votersList(h);
System.out.println(g);
sc.close();
}
}