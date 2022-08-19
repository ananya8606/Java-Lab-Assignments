package Lab2;
import java.util.*;
public class Exercise4 {
	int n,k;
    int[] b;
	Exercise4(int n){
		this.n=n;
	}
	int[] modifyArray(int[] b,int k)
	{
	int[] c=new int[k];
	for(int i=0;i<k;i++)
	c[i]=b[i];
	Arrays.sort(c);
	int[] d=new int[k];
	for(int i=k-1;i>=0;i--)
	d[k-i-1]=c[i];
	return d;
	}
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 HashMap<Integer,Integer> map=new HashMap<>();
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 int[] b=new int[n];
     int k=0;
	 for(int i=0;i<n;i++)
	 {
	 arr[i]=sc.nextInt();
	 if(map.get(arr[i])==null)
	 b[k++]=arr[i];
	 map.put(arr[i],1);
	 }
	 Exercise4 a=new Exercise4(n);
	 int[] s=a.modifyArray(b,k);
	 for(int i=0;i<k;i++)
	 System.out.print(s[i]+" ");
	 sc.close();
	}
}
