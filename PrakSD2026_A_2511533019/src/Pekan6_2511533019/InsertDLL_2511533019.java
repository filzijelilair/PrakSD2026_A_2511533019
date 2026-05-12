package Pekan6_2511533019;

public class InsertDLL_2511533019 {
	//menambahkan node diawal DLL
	static NodeDLL_2511533019 insertBegin_3019(NodeDLL_2511533019 head_3019, int data_3019) {
		//buat node baru
		NodeDLL_2511533019 new_node = new NodeDLL_2511533019(data_3019);
		// jadikan pointer nextnya head
		new_node.next_3019 = head_3019;
		//jadikan pointer prehead ke new_node
		if (head_3019!= null) {
		head_3019.prev_3019 = new_node;
		}
		return new_node;		
	}	
	//fungsi menambahkan node di akhir
public static NodeDLL_2511533019 insertEnd_3019 (NodeDLL_2511533019 head_3019, int newData_3019) {
	//buat node baru
	NodeDLL_2511533019 newNode_3019 = new NodeDLL_2511533019 (newData_3019);
	//jika DLL null jadikan head
	if(head_3019 == null) {
		head_3019 = newNode_3019;
	}else{
		NodeDLL_2511533019 curr_3019 = head_3019;
		while (curr_3019.next_3019!= null) {
			curr_3019 = curr_3019.next_3019;
		}
		curr_3019.next_3019 = newNode_3019;
		newNode_3019.prev_3019 = curr_3019;
		}
	return head_3019;
}
//fungsi menambahkan node di posisi tertentu
public static NodeDLL_2511533019 insertAtPosition_3019 (NodeDLL_2511533019 head_3019, int pos_3019, int new_data_3019) {
	// buat node baru
	NodeDLL_2511533019 new_node_3019 = new NodeDLL_2511533019 (new_data_3019);
	if (pos_3019 == 1) {
		new_node_3019.next_3019 = head_3019;
		if (head_3019!= null) {
			head_3019.prev_3019 = new_node_3019;}
		head_3019 = new_node_3019;
		return head_3019;}
		NodeDLL_2511533019 curr_3019 = head_3019;
	for (int i_3019 = 1; i_3019<pos_3019 - 1 && curr_3019 != null; ++i_3019) {
		curr_3019 = curr_3019.next_3019;
		}
	if (curr_3019 == null) {
		System.out.println("Posisi tidak ada"); 
		return head_3019;
	}
	new_node_3019.prev_3019 = curr_3019;
	new_node_3019.next_3019 = curr_3019.next_3019;
	curr_3019.next_3019 = new_node_3019;
	if (new_node_3019.next_3019 != null) {
		new_node_3019.next_3019.prev_3019=new_node_3019; }
	return head_3019;
}
public static void printlist_3019(NodeDLL_2511533019 head_3019) {
	NodeDLL_2511533019 curr_3019 = head_3019;
	while (curr_3019 != null) {
		System.out.print(curr_3019.data_3019 + " <-> ");
		curr_3019 = curr_3019.next_3019;
	}
	System.out.println();
}
public static void main(String[] args) {
	//membuat DLL 2 <-> 3 <-> 5
	NodeDLL_2511533019 head_3019= new NodeDLL_2511533019(2);
	head_3019.next_3019= new NodeDLL_2511533019(3);
	head_3019.next_3019.prev_3019 = head_3019;
	head_3019.next_3019.next_3019= new NodeDLL_2511533019(5);
	head_3019.next_3019.next_3019.prev_3019= head_3019.next_3019;
	//cetak DLL awal
	System.out.print("DLL Awal : ");
	printlist_3019(head_3019);
	// tambah 1 di awal
	head_3019 = insertBegin_3019(head_3019, 1) ;
		System.out.print ("simpul 1 ditambah di awal: ");
	printlist_3019(head_3019) ;
	// tambah 6 di akhir
	System.out.print ("simpul 6 ditambah di akhir: ");
	int data_3019 = 6;
	head_3019 = insertEnd_3019 (head_3019, data_3019);
	printlist_3019(head_3019);
	// menambah node 4 di posisi 4
	System.out.print ("tambah node 4 di posisi 4: ");
	int data2_3019 = 4;
	int pos_3019 = 4;
	head_3019 = insertAtPosition_3019(head_3019, pos_3019, data2_3019) ;
	printlist_3019(head_3019);
	}
}