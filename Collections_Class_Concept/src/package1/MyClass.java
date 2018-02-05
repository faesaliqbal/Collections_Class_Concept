package package1;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {

	public static void main(String[] args) {
		
		/*
		 * Collections Class
		 * For the manipulation of data in different collection types, Java API provides a Collections class.
		 * It is included in java.util package.
		 * One of the most popular Collections class methods is sort() which sorts the elements of your collection type.
		 * The methods in Collections class are static, so you don't need a Collections class object to call them.
		 */
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("dog");
		animals.add("cat");
		animals.add("snake");
		
		System.out.println("original list: "+animals);
		
		//How to sort this list
		Collections.sort(animals);
		System.out.println("sorted list: "+animals);
		
		ArrayList<Integer> myList1 = new ArrayList<Integer>();
		myList1.add(4);
		myList1.add(1);
		myList1.add(18);
		myList1.add(45);
		
		//Other useful methods for Collections class
		System.out.println(Collections.max(myList1));//output is 45
		System.out.println(Collections.min(myList1));//output is 1
		Collections.reverse(myList1);//this would reverse the order in which elements are added
		System.out.println(myList1);
		Collections.shuffle(myList1);//this would shuffle the elements in random order
		System.out.println(myList1);
		
		

	}

}
