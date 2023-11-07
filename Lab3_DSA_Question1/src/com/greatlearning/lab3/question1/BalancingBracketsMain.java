package com.greatlearning.lab3.question1;
import java.util.Stack;

public class BalancingBracketsMain {
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input ="{}";
		//System.out.println(isBalancedBracket(input));
		
		
		

	//}
	public  boolean isBalancedBracket(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		for (char ch : input. toCharArray()) {
			if (ch ==  '{'|| ch == '(' || ch == '[') {
				stack.push(ch);
				continue;
			}

			if(stack.isEmpty()) { 
				return false;
			}
			switch (ch) {
			case '}':
				if(stack.pop() != '{') {
					
					return false;
				}
				break;
			case ']':
				if(stack.pop() != '[') {
					return false;
				}
				break;	
			case ')':
				if(stack.pop() != '(') {
					return false;
				}
				break;	
			default:	
				System.out.println("Invalid chracter in input string");
				return false;
			}
		}				
		return (stack.isEmpty());
	}

}
