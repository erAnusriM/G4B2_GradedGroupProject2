package com.gl.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class DisplayImplementation {

	public static ArrayList<String> displayList;

	public static ArrayList<String> initializeDisplayList(int size) {
		displayList = new ArrayList<String>(size);
		for (int i = 0; i < size; i++) {
			displayList.add("");
		}
		return displayList;
	}

	public static void generateDisplayFromStackList(ArrayList<Stack<HashMap<Integer, Integer>>> stackList,
			ArrayList<String> displayList) {
		Iterator<Stack<HashMap<Integer, Integer>>> it = stackList.iterator();
		while (it.hasNext()) {
			Stack<HashMap<Integer, Integer>> st = (Stack<HashMap<Integer, Integer>>) it.next();
			if (!st.isEmpty()) {
				HashMap<Integer, Integer> item1 = (HashMap<Integer, Integer>) st.peek();
				Object peekObject = item1.keySet().toArray()[0];
				Integer index = item1.get(peekObject);
				String value = "";
				while (!st.isEmpty()) {
					HashMap<Integer, Integer> elem = (HashMap<Integer, Integer>) st.pop();
					value += (int) elem.keySet().toArray()[0] + " ";
				}
				displayList.set(index, value);
			}
		}

		printDisplayList(displayList);
	}

	public static void printDisplayList(ArrayList<String> displayList) {
		System.out.println();
		for (int i = 0; i < displayList.size(); i++) {
			System.out.println("Day: " + (i + 1));
			System.out.println(displayList.get(i));
		}
	}
}
