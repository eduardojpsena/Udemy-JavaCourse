package application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();
		
		String[] urns = {"Alex Blue,15", "Maria Green,22", "Bob Brown,21", "Alex Blue,30", "Bob Brown,15", "Maria Green,27"
							, "Maria Green,22", "Bob Brown,25", "Alex Blue,31"};
		
		for (String s : urns) {
			String[] fields = s.split(",");
			
			String name = fields[0];
			int count = Integer.parseInt(fields[1]);
			
			if (votes.containsKey(name)) {
				int votesSoFar = votes.get(name);
				votes.put(name, count + votesSoFar);
			} else {
				votes.put(name, count);
			}
		}
		
		for (String key : votes.keySet()) {
			System.out.println(key + ": " + votes.get(key));
		}
		
		sc.close();
	}

}
