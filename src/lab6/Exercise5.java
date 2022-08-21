package lab6;
import java.util.*;
public class Exercise5 {
	@SuppressWarnings("removal")
	int getSecondSmallest(int arr[]) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			a.add(new Integer(arr[i]));
		Collections.sort(a);
		return a.get(1);
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++)
		 arr[i]=sc.nextInt();
	 Exercise5 a=new Exercise5();
	 int b=a.getSecondSmallest(arr);
	 System.out.println(b);
	 sc.close();
	}
}