package lab6;
import java.util.HashMap;
import java.util.Scanner;
public class Exercise3 {
HashMap<Integer,Integer> getSquares(int[] arr){
	HashMap<Integer,Integer> h=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
	h.put(arr[i],arr[i]*arr[i]);
	}
	return h;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	 for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		Exercise3 e=new Exercise3();
		HashMap<Integer,Integer> j=e.getSquares(a);
		System.out.println(j);
		sc.close();
}
}
