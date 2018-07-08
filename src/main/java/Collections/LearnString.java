package grid;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnString {

	public static void main(String[] args) {
		/*String companyName = "google";
		int hashCode = companyName.hashCode();
		System.out.println(hashCode);
		companyName = "Facebook";
		System.out.println(companyName.hashCode());
		//StringBuffer
		*/
		/*StringBuilder build = new StringBuilder("google");
		int hashCode2 = build.hashCode();
		System.out.println(hashCode2);
		
		build = build.reverse();
		System.out.println(build);
		System.out.println(build.hashCode());*/
		
		/*String comp = new String("google");
		System.out.println(comp.hashCode());
		String comp1 = new String("google");
		System.out.println(comp1.hashCode());
		if (comp == comp1) {
			System.out.println("Both objects are same");
		}else {
			System.out.println("Both obj are different");
		}*/
		
		/*String s = "google1";
		String r = "google";
		if (s == r) {
			System.out.println("Both literals are same");
		}else {
			System.out.println("Both literals are different");
		}*/
		
		// number of occurrences
		
		String comp = "google";
		
		/*Set<Character> uniquechar = new LinkedHashSet<Character>();
		char[] charArray = comp.toCharArray();
		for (char c : charArray) {
			uniquechar.add(c);
		}
		System.out.println(uniquechar);
		*/
		// Using List
		List<Character> list = new ArrayList<Character>();
		char[] charArray = comp.toCharArray();
		for (char c : charArray) {
			if (!list.contains(c)) {
				list.add(c);
			}
		}
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		/*char ch = 'i';
		int i = 0;
		char[] charArray = comp.toCharArray();
		for (char c : charArray) {
			if (c == ch) {
				i++;
			}
		}
		System.out.println(i);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		//String comp = new String("google");
		char[] charArray = companyName.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}

		int length = companyName.length();
		for (int i = length-1; i >= 0; i--) {
			System.out.println(charArray[i]);
		}

		for (int i = length-1; i >= 0; i--) {
			System.out.println(companyName.charAt(i));
		}
*/




	}

}











