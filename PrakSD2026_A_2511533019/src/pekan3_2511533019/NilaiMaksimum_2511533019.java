package pekan3_2511533019;
import java.util.Stack;

public class NilaiMaksimum_2511533019 {
	public static int max_3019(Stack<Integer> s_3019) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue_3019= s_3019.pop();
		backup.push(maxValue_3019);
		while (!s_3019.isEmpty()) {
			int next_3019= s_3019.pop();
			backup.push(next_3019);
			maxValue_3019 = Math.max(maxValue_3019, next_3019);
		}
		while (!backup.isEmpty()) {
			s_3019.push(backup.pop());
		}
		return maxValue_3019;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s_3019= new Stack<Integer>();
		s_3019.push(70);
		s_3019.push(12);
		s_3019.push(20);
		System.out.println("isi stack "+s_3019);
		System.out.println("Stack teratas "+s_3019.peek());
		System.out.println("Nilai Maksimum "+ max_3019(s_3019));
	}

}
