package com.bini.babu;

public class LabelledBlock {

	public static void main(String[] args) {
		int x = 20;
		l1: {
			System.out.println("Inside the labelled block"); // example of labelled block
			if (x == 20) {
				break l1;
			}
		}
	}

}
