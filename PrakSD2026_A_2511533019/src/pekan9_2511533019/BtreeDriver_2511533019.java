package pekan9_2511533019;

public class BtreeDriver_2511533019 {
	public static void main(String[] args) {
		// TODO Auto-generated method
		//Membuat Pohon
		BTree_2511533019 tree_3019 = new BTree_2511533019();
		System.out.print("Jumlah Simpul awal pohon: ");
		System. out.println(tree_3019.countNodes_3019());
		
		//menambahkan simpul data 1
		Node_2511533019 root_3019 = new Node_2511533019(1);
		//menjadikan simpul 1 sebagai root
		tree_3019.setRoot_3019(root_3019);
		System.out.println ("Jumlah simpul jika hanya ada root");
		System. out.println (tree_3019.countNodes_3019());
		Node_2511533019 node2_3019 = new Node_2511533019(2);
		Node_2511533019 node3_3019 = new Node_2511533019(3);
		Node_2511533019 node4_3019 = new Node_2511533019(4);
		Node_2511533019 node5_3019 = new Node_2511533019(5);
		Node_2511533019 node6_3019 = new Node_2511533019(6);
		Node_2511533019 node7_3019 = new Node_2511533019(7);
		Node_2511533019 node8_3019 = new Node_2511533019(8);
		Node_2511533019 node9_3019 = new Node_2511533019(9);
		root_3019.setleft_3019(node2_3019); 
		node2_3019.setleft_3019(node4_3019); 
		node2_3019.setRight_3019(node5_3019); 
		node4_3019.setRight_3019(node8_3019); 
		root_3019.setRight_3019(node3_3019); 
		node3_3019.setleft_3019(node6_3019); 
		node3_3019.setRight_3019(node7_3019); 
		node6_3019.setleft_3019(node9_3019);
		//set root
		tree_3019.setCurrent_3019(tree_3019.getRoot_3019());
		System.out.println("menampilkan simpul terakhir : ");
		System.out.println(tree_3019.getCurrent_3019().getData_3019());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan") ;
		System.out.println(tree_3019.countNodes_3019());
		System.out.println("InOrder: ");
		tree_3019.printInorder_3019();
		System.out.println("\nPreorder: ");
		tree_3019.printPreOrder_3019();
		System.out.println ("\nPostorder : ");
		tree_3019.printPostorder_3019();
		System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
		tree_3019.print_3019() ;
	}

}
