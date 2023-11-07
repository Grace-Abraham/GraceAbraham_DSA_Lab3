package com.greatlearning.lab3.question1;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancingBracketsMain bb = new BalancingBracketsMain ();

		System.out.println("Please enter a string of brackets:");
		Scanner myobj  = new Scanner(System.in);

		String expr = myobj.nextLine();

		myobj.close();

		if (expr == null || expr.isEmpty()) { 
			System.out.println("The entered String is empty");
		}

		else if (bb.isBalancedBracket (expr)) {
			System.out.println("The entered sthing has Balanced Brackets");

		} else { 
			System.out.println("The entered Strings do not contain Balanced Brackets");


		
		}
		
	}
}
