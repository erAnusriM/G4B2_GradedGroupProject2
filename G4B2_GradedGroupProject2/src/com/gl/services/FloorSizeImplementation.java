package com.gl.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class FloorSizeImplementation {

	public static void inputValues(int size, ArrayList<Stack<HashMap<Integer, Integer>>> stackList) {
		for (int idx = 0; idx < size; idx++) {
			System.out.println("enter the floor size given on day : " + (idx + 1));
			int val = InputImplementation.getInput();
			if (val > 0) {
				HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
				map.put(val, idx);
				Stack<HashMap<Integer, Integer>> presentStack = StackImplementation.peek(val);
				if (presentStack == null) {
					Stack<HashMap<Integer, Integer>> myStack = new Stack<HashMap<Integer, Integer>>();
					myStack.push(map);
					stackList.add(myStack);
				} else {
					presentStack.push(map);
				}
			}
		}
	}

}
