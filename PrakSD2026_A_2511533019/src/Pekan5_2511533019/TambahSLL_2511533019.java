package Pekan5_2511533019;

public class TambahSLL_2511533019 {
	public static NodeSLL_2511533019 insertAtFront_3019(NodeSLL_2511533019 head_3019, int value_3019) {
		NodeSLL_2511533019 new_node = new NodeSLL_2511533019(value_3019);
		new_node.next_3019= head_3019;
		return new_node;
	}
	//fungsi menambahkan node diakhir SLL
	public static NodeSLL_2511533019 insertAtEnd_3019(NodeSLL_2511533019 head_3019, int value_3019) {
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511533019 newNode_3019 = new NodeSLL_2511533019(value_3019);
		// jika list kosong maka node jadi head
		if (head_3019 == null) {
			return newNode_3019;
		}
	  //simpan head ke variabel sementara
		NodeSLL_2511533019 last = head_3019;
		// telusuri ke node akhir while {
			while (last.next_3019 != null) {
				last = last.next_3019;
			}
			//ubah pointer
			last.next_3019 = newNode_3019;
			return head_3019;
		}
		static NodeSLL_2511533019 GetNode_3019 (int data_3019) {
			return new NodeSLL_2511533019(data_3019) ;
		}
		static NodeSLL_2511533019 insertPos_3019(NodeSLL_2511533019 headNode_3019, int posistion_3019, int value_3019) {
			NodeSLL_2511533019 head_3019= headNode_3019;
			if(posistion_3019 < 1)
				System.out.print("invalid position");
			if (posistion_3019 == 1) {
				NodeSLL_2511533019 new_node = new NodeSLL_2511533019(value_3019);
				new_node.next_3019 = head_3019;
				return new_node;
			} else {
				while (posistion_3019-- != 0) {
					if (posistion_3019 == 1) {
						NodeSLL_2511533019 newNode_3019 = GetNode_3019(value_3019);
						newNode_3019.next_3019 = headNode_3019.next_3019;
						headNode_3019.next_3019 = newNode_3019;
						break;
					}
					headNode_3019 = headNode_3019.next_3019;
				}	
				if (posistion_3019 != 1)
					System.out.print ("Posisi di luar jangkauan");}
					return head_3019; }
			public static void printList_3019 (NodeSLL_2511533019 head_3019) {
				NodeSLL_2511533019 curr = head_3019;
				while (curr.next_3019 != null) {
						System.out.print (curr.data_3019 +"-->");
						curr = curr.next_3019;
				}
				if (curr.next_3019== null) {
					System.out.print (curr.data_3019) ;
					System.out.println();}
				}
				
			public static void main (String[] args) {
					// buat linked list 2->3->5->6
					NodeSLL_2511533019 head_3019 = new NodeSLL_2511533019(2);
					head_3019.next_3019 = new NodeSLL_2511533019(3) ; 
					head_3019.next_3019.next_3019 = new NodeSLL_2511533019(5); 
					head_3019.next_3019.next_3019.next_3019 = new NodeSLL_2511533019(6);
						
					// cetak list asli
					System.out.print("Senarai berantai awal:"); 
					printList_3019(head_3019);
					
					// tambahkan node baru di depan
					System.out.print("tambah 1 simpul di depan: ");
					int data_3019 = 1;
					head_3019= insertAtFront_3019 (head_3019, data_3019);
				
					// cetak update list
					printList_3019(head_3019);
						
					// tambahkan node baru di belakang
					System.out.print("tambah 1 simpul di belakang: ");
						int data2 = 7;
						head_3019 = insertAtEnd_3019(head_3019, data2);
						
					// cetak update list
					printList_3019(head_3019);
					System.out.print("tambah 1 simpul ke data 4: ");
						int data3 = 4;
						int pos = 4;
						head_3019 = insertPos_3019(head_3019, pos, data3);
					// cetak update list
					printList_3019(head_3019);
			}
		}	