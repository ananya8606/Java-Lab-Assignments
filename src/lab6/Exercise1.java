package lab6;
import java.util.*;
public class Exercise1 {
	ArrayList<Integer> getValues(HashMap<Integer,Integer> h)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> m:h.entrySet()) {
			a.add(m.getValue());
			}
			Collections.sort(a);
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
Exercise1 d=new Exercise1();
ArrayList<Integer> g=d.getValues(h);
System.out.println(g);
sc.close();
}
}