package com.gl.services;

import java.util.ArrayList;
import java.util.Scanner;

public class InputImplementation {

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Integer> inputList = new ArrayList<Integer>();

	public static int getInput() {
		int floorSize = scan.nextInt();
		if (!isEntryPresent(inputList, floorSize)) {
			if (floorSize < 0) {
				System.out.println(floorSize + " invalid number");
				System.exit(0);
			}
			inputList.add(floorSize);
			return floorSize;
		} else {
			System.out.println(floorSize + " duplicate value");
			System.exit(0);
		}
		return 0;
	}

	public static boolean isEntryPresent(ArrayList<Integer> inputList, int value) {
		boolean isPresent = false;
		for (Integer item : inputList) {
			if (item == value) {
				isPresent = true;
			}
		}
		return isPresent;
	}
}
