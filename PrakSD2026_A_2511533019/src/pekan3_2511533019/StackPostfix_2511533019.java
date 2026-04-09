package pekan3_2511533019;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533019 {
	public static int postfixEvaluate_3019(String expression) {
		Stack<Integer> s_3019 = new Stack<Integer>();
		Scanner input_3019 = new Scanner(expression);
		while(input_3019.hasNext()) { 
			if (input_3019.hasNextInt()) { //an operan (integer)
		          s_3019.push(input_3019.nextInt());
		} else {
			String operator_3019 = input_3019.next();
			int operand2_3019 =s_3019.pop();
			int operand1_3019 =s_3019.pop();
			if (operator_3019.equals("+")) {
				s_3019.push(operand1_3019 + operand2_3019);
			}else if (operator_3019.equals("-")) {
				s_3019.push(operand1_3019 - operand2_3019);
			}else if (operator_3019.equals("*")) {
				s_3019.push(operand1_3019 * operand2_3019);
			}else {
				s_3019.push(operand1_3019 / operand2_3019);
			}
		}
	}
	input_3019.close();
	return s_3019.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hasil postfix= "+postfixEvaluate_3019(" 5 2 4 * + 7 -"));
	}

}
