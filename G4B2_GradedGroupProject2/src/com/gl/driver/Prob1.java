package com.gl.driver;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

import com.gl.services.DisplayImplementation;
import com.gl.services.FloorSizeImplementation;
import com.gl.services.StackImplementation;

public class Prob1 {

	public static Scanner scan = new Scanner(System.in);
	public static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the total no of floors in the building ");
		size = scan.nextInt();
		if (size > 0) {
			ArrayList<Stack<HashMap<Integer, Integer>>> stackList = StackImplementation.initializeStackList(size);
			ArrayList<String> displayList = DisplayImplementation.initializeDisplayList(size);

			FloorSizeImplementation.inputValues(size, stackList);
			DisplayImplementation.generateDisplayFromStackList(stackList, displayList);
		} else {
			System.out.println("You have entered an invalid input");
			System.exit(0);
		}
	}
}
