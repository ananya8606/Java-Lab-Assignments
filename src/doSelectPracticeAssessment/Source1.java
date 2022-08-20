package doSelectPracticeAssessment;

import java.util.*;

class Mobile {
	// Write your code here..
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model) {
		if (!mobiles.containsKey(company)) {
			ArrayList<String> m = new ArrayList<String>();
			m.add(model);
			mobiles.put(company, m);
		} else {
			ArrayList<String> m = mobiles.get(company);
			if (m == null) {
				m = new ArrayList<String>();
				m.add(model);
				mobiles.put(company, m);
			} else {
				m.add(model);
				mobiles.put(company, m);
			}
		}
		return "model successfully added";
	}

	public ArrayList<String> getModels(String company) {
		if (!mobiles.containsKey(company))
			return null;
		else {
			ArrayList<String> m = mobiles.get(company);
			if (m == null)
				return null;
			else
				return mobiles.get(company);
		}
	}

	public String buyMobile(String company, String model) {
		if (!mobiles.containsKey(company))
			return "item not available";
		else {
			ArrayList<String> m = mobiles.get(company);
			if (m == null || !m.contains(model))
				return "item not available";
			else {
				m.remove(model);
				return "mobile sold successfully";
			}
		}
	}
}

public class Source1 {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		String company = sc.nextLine();
		String model = sc.nextLine();
		Mobile m = new Mobile();
		String a = m.addMobile(company, model);
		ArrayList<String> b = m.getModels(company);
		String c = m.buyMobile(company, model);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}
}
