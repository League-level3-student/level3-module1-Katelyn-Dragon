package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> fruits = new ArrayList<String>();
		// 2. Add five Strings to your list
		fruits.add("banana");
		fruits.add("pomegranate");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("strawberry");
		// 3. Print all the Strings using a standard for-loop
		for (int j = 0; j < fruits.size(); j++) {
			System.out.println(fruits.get(j));
		}
		// 4. Print all the Strings using a for-each loop
		for(String s : fruits) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < fruits.size(); i++) {
			if (i%2 == 0) {
				System.out.println(fruits.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = fruits.size() - 1; i>= 0; i--) {
			System.out.println(fruits.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < fruits.size(); i++) {
			for (int j = 0; j < fruits.get(i).length(); j++) {
				if(fruits.get(i).charAt(j) == 'e') {
					System.out.println(fruits.get(i));
					break;
				}
			}
		}
	}
}
