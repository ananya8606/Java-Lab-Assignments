package lab6;
import java.util.*;
public class Exercise2 {
HashMap<Character,Integer> countChars(char[] arr){
	HashMap<Character,Integer> h=new HashMap<>();
	for(int i=0;i<arr.length;i++)
		h.put(arr[i],0);
	for(int i=0;i<arr.length;i++) {
	h.put(arr[i],h.get(arr[i])+1);
	}
	return h;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char[] a=new char[n];
	 for(int i=0;i<n;i++)
		a[i]=sc.next().charAt(0);
		Exercise2 e=new Exercise2();
		HashMap<Character,Integer> j=e.countChars(a);
		System.out.println(j);
		sc.close();
}
}
