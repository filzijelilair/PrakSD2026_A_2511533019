package pekan9_2511533019;

public class BTree_2511533019 {
	private Node_2511533019 root_3019; 
	private Node_2511533019 currentNode_3019;
	public BTree_2511533019 () {
		root_3019 = null;
	}
	public boolean search_3019(int data_3019) {
		return search_3019(root_3019, data_3019);
	}
	private boolean search_3019(Node_2511533019 node_3019, int data_3019) {
		if (node_3019.getData_3019() == data_3019)
			return true;	
		if (node_3019.getleft_3019()!= null)
			if (search_3019(node_3019.getleft_3019(),data_3019))
				return true;
		if (node_3019.getRight_3019()!=null)
			if (search_3019(node_3019.getRight_3019(), data_3019))
				return true;
		return false;
	}
	public void printInorder_3019() {
		root_3019.printInorder_3019(root_3019);
	}
	public void printPreOrder_3019() {
		root_3019.printPreorder_3019 (root_3019);
	}
	public void printPostorder_3019() {
		root_3019.printPostorder_3019(root_3019);
	}
	public Node_2511533019 getRoot_3019() {
		return root_3019;
	}
	public boolean isEmpty_3019() {
		return root_3019 == null;
	}
	public int countNodes_3019() {
		return countNodes_3019(root_3019);
	}
	
	private int countNodes_3019(Node_2511533019 node_3019) {
		int count_3019= 1;
		if (node_3019==null) {
			return 0;
		}else{
			count_3019 += countNodes_3019(node_3019.getleft_3019());
			count_3019 += countNodes_3019(node_3019.getRight_3019());
			return count_3019;
		}
	}
	
	public void print_3019() {
		root_3019.print_3019();
	}
	public Node_2511533019 getCurrent_3019() {
		return currentNode_3019;
	}
	public void setCurrent_3019(Node_2511533019 node_3019) {
		this.currentNode_3019=node_3019;
	}
	public void setRoot_3019(Node_2511533019 root_3019) {
		this.root_3019=root_3019;
	}
}