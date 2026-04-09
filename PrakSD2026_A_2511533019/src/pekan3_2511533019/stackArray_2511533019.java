package pekan3_2511533019;

public class stackArray_2511533019 {
	static final int MAX_3019 = 10000;
	int top_3019;
	int a_3019[] = new int[MAX_3019];
	boolean isEmpty_3019()
	{
		return (top_3019 < 0);
	}
	stackArray_2511533019()
	{
		top_3019 =-1;
	}
	boolean push_3019(int x) 
	{
		if (top_3019 >= (MAX_3019 -1)) {
			System.out.println("Stack Overflow");
			return false;
		}else { 
			a_3019[++top_3019]=x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_3019()
	{
		if (top_3019<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x= a_3019[top_3019--];
			return x;
		}
	}
	int peek_3019()
	{
		if (top_3019 < 0) {
			System.out.println("Stack underflow");
			return 0;
		}else {
			int x = a_3019[top_3019];
			return x;
		}
	}
	void print_3019() {
		for(int i = top_3019;i>-1;i--) {
			System.out.print(" " + a_3019[i]);
		}
	}
}
