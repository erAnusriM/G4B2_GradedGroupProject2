package com.gl.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class StackImplementation {
	public static ArrayList<Stack<HashMap<Integer, Integer>>> stackList;

	public static ArrayList<Stack<HashMap<Integer, Integer>>> initializeStackList(int size) {
		stackList = new ArrayList<Stack<HashMap<Integer, Integer>>>(size);
		return stackList;
	}

	public static Stack<HashMap<Integer, Integer>> peek(Integer value) {
		Stack<HashMap<Integer, Integer>> newStack = new Stack<HashMap<Integer, Integer>>();
		newStack = null;
		Iterator<Stack<HashMap<Integer, Integer>>> it = stackList.iterator();
		while (it.hasNext()) {
			Stack<HashMap<Integer, Integer>> st = (Stack<HashMap<Integer, Integer>>) it.next();
			HashMap<Integer, Integer> item1 = (HashMap<Integer, Integer>) st.peek();
			Object peekObject = item1.keySet().toArray()[0];
			int i = (Integer) peekObject;
			if (i + 1 == value) {
				newStack = st;
				break;
			}
		}
		return newStack;
	}
}
