package com.main;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Please enter number: ");

			long sequenceNumber = scanner.nextLong();

			SequenceGenerator sequenceGenerator = new SequenceGenerator();

			System.out.print(sequenceGenerator.getSequenceValue(sequenceNumber));

		} catch (Exception e) { 
			System.out.print("Invalid number");
		}

	}
}
