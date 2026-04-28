package Pekan4_2511533019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_3019 = new LinkedList<Integer>();
		q_3019.add(1);
		q_3019.add(2);
		q_3019.add(3);// [1,2,3]
		System.out.println("sebelum reverse"+ q_3019);
		Stack<Integer> s_3019 = new Stack<Integer>();
		while(!q_3019.isEmpty()) {//Q -> S
			s_3019.push(q_3019.remove());
		}
		while(!s_3019.isEmpty()) {//S -> Q
			q_3019.add(s_3019.pop());
		}
		System.out.println("sesudah reverse = "+q_3019);
			
	}

}
