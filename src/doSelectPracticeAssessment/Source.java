package doSelectPracticeAssessment;

import java.util.*;

class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(0);
		}
		return a;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		Collections.reverse(list);
		return list;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == m)
				list.set(i, n);
		}
		return list;
	}
}

public class Source {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int after = sc.nextInt();
		ArrayListOps a = new ArrayListOps();
		ArrayList<Integer> list = a.makeArrayListInt(n);
		ArrayList<Integer> nlist = new ArrayList<Integer>();
		while (sc.hasNextInt())
			nlist.add(sc.nextInt());
		System.out.println(list);
		ArrayList<Integer> revlist = a.reverseList(nlist);
		System.out.println(revlist);
		ArrayList<Integer> clist = a.changeList(revlist, m, after);
		System.out.println(clist);
		sc.close();
	}
}
