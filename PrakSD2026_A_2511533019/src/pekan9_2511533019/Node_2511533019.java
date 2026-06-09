package pekan9_2511533019;

public class Node_2511533019 {			
	int data_3019;
	Node_2511533019 left_3019;
	Node_2511533019 right_3019;
	public Node_2511533019 (int data_3019) {
		this.data_3019 = data_3019;
		left_3019 = null;
		right_3019 = null;
	}	
	public void setleft_3019 (Node_2511533019 node_3019) {
		if (left_3019 == null)
			left_3019 = node_3019;
	}
	public void setRight_3019 (Node_2511533019 node_3019) {
		if (right_3019 == null)
			right_3019 = node_3019;
	}
	public Node_2511533019 getleft_3019() {
		return left_3019;
	}
	public Node_2511533019 getRight_3019 () {
		return right_3019;
	}
	public int getData_3019() {
		return data_3019;
	}
	public void setData_3019(int data_3019) {
		this.data_3019 = data_3019;
	}
			
	void printPreorder_3019 (Node_2511533019 node_3019) {
		if (node_3019 == null)
			return;
			System.out.print(node_3019.data_3019 + " "); 
			printPreorder_3019(node_3019.left_3019); 
			printPreorder_3019(node_3019.right_3019);				
	}		
	void printPostorder_3019(Node_2511533019 node_3019) {					
		if (node_3019 == null)					
			return;
		printPostorder_3019 (node_3019.left_3019); 
		printPostorder_3019 (node_3019.right_3019);
		System.out.print(node_3019.data_3019 + " ");
	}
	void printInorder_3019(Node_2511533019 node_3019) {
		if (node_3019== null)
			return;
		printInorder_3019(node_3019.left_3019);
		System.out.print(node_3019.data_3019 + " "); 
		printInorder_3019(node_3019.right_3019);
	}
	public String print_3019() {
		return this.print_3019("", true, "");
	}
	public String print_3019(String prefix_3019, boolean isTail_3019, String sb_3019) {
		if (right_3019!= null) {
		right_3019.print_3019(prefix_3019 + (isTail_3019 ? "|   " : "   "), false, sb_3019);
		}
		System.out.println( prefix_3019 + (isTail_3019 ? "\\--" : "/-- ")+data_3019); 
		if (left_3019 != null) { 
			left_3019.print_3019 (prefix_3019+ (isTail_3019 ?"  ":"|   "), true, sb_3019);
		}
		return sb_3019;
		}
	}
