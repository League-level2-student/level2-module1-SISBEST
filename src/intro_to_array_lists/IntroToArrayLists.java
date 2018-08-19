package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> arl = new ArrayList<String>();
		//2. Add five Strings to your list
		arl.add("1");
		arl.add("2");
		arl.add("3");
		arl.add("4");
		arl.add("5");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<arl.size(); i++) {
			System.out.println(arl.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s: arl) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i>arl.size(); i++) {
		if(i == 1 || i == 3) {
		System.out.println(arl.get(i));
		}}
		//6. Print all the Strings in reverse order.
		
	}
}
