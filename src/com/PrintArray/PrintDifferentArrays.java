package com.PrintArray;

public class PrintDifferentArrays<E, F, G> {
	E[] myAErray;
	F[] myFArray;
	G[] myZArray;

	public PrintDifferentArrays(E[] myAErray, F[] myFArray, G[] myZArray) {
		this.myAErray = myAErray;
		this.myFArray = myFArray;
		this.myZArray = myZArray;

	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleAray = { 1.2, 2.2, 3.2, 4.2, 5.2 };
		Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		PrintArray(intArray);
		PrintArray(doubleAray);
		PrintArray(charArray);
		new PrintDifferentArrays<Integer, Double, Character>(intArray, doubleAray, charArray).PrintArray();
	}

	private void PrintArray() {
		PrintArray(myAErray);
		PrintArray(myFArray);
		PrintArray(myZArray);
	}

//Common Print Method
	public static <E extends Object> void PrintArray(E[] a) {
		for (E i : a) {
			System.out.println(i);
		}
	}
}