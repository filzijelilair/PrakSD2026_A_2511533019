package Pekan5_2511533019;

public class HapusSLL_2511533019 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511533019 deleteHead_3019(NodeSLL_2511533019 head_3019) {
		//jika SLL kosong
		if (head_3019== null);
		//pindahkan head ke node berikutnya
		head_3019 = head_3019.next_3019;
		//return head baru
		return head_3019;
	}
	//fungsi menghapus node trakhir SLL
	public static NodeSLL_2511533019 removeLastNode_3019(NodeSLL_2511533019 head_3019) {
		//jika list kosong, return null
		if(head_3019 == null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_3019.next_3019== null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511533019 secondLast_3019 = head_3019;
		while (secondLast_3019.next_3019.next_3019 != null) {
			secondLast_3019 = secondLast_3019.next_3019;
		}
		// hapus node terakhir
		secondLast_3019.next_3019= null;
		return head_3019; }
	
	//fungsi menghapus node di posisi tertentu
		public static NodeSLL_2511533019 deleteNode_3019(NodeSLL_2511533019 head_3019, int position_3019) {
			NodeSLL_2511533019 temp_3019=head_3019;
			NodeSLL_2511533019 prev_3019=null;
	// jika linked list null 
			if (temp_3019 == null)
				return head_3019;
	//kasus 1: head dihapus
	if (position_3019 == 1) {
		head_3019 = temp_3019.next_3019;
		return head_3019;
		}
	// kasus 2: menghapus node di tengah
	// telusuri ke node yang dihapus
	for (int i = 1; temp_3019 != null && i < position_3019; i++) {
			prev_3019 = temp_3019;
			temp_3019 = temp_3019.next_3019;}
	// jika ditemukan,hapus node
	if (temp_3019 != null) {
		prev_3019.next_3019 = temp_3019.next_3019;
	} else {
			System.out.println ("Data tidak ada");}
	return head_3019; 
	}
	//fungsi mencetak SLL
	public static void printList_3019(NodeSLL_2511533019 head_3019) {
		NodeSLL_2511533019 curr_3019 = head_3019;
		while (curr_3019.next_3019 != null) {
			System.out.print(curr_3019.data_3019 +"-->");
			curr_3019 = curr_3019.next_3019; }
		if (curr_3019.next_3019==null) {
			System.out.print(curr_3019.data_3019);}
		System.out.println(); }
	
	//kelas main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// buat SLL 1 -> 2 -> 3 -> 4 -> 5-> 6 -> null
		NodeSLL_2511533019 head_3019 = new NodeSLL_2511533019(1); 
		head_3019.next_3019=new NodeSLL_2511533019(2); 
		head_3019.next_3019.next_3019=new NodeSLL_2511533019(3); 
		head_3019.next_3019.next_3019.next_3019=new NodeSLL_2511533019(4); 
		head_3019.next_3019.next_3019.next_3019.next_3019 =new NodeSLL_2511533019(5); 
		head_3019.next_3019.next_3019.next_3019.next_3019.next_3019= new NodeSLL_2511533019(6);
		// cetak list awal
		System.out.println ("list awal: ");
		printList_3019(head_3019);
		// hapus head
		head_3019=deleteHead_3019(head_3019);
		System.out.println("List setelah head dihapus: ");
		printList_3019(head_3019); 
		//hapus node terakhir
		head_3019=removeLastNode_3019(head_3019);
		System.out.println ("List setelah simpul terakhir di hapus: ");
		printList_3019(head_3019);
		// Deleting node at position 2
		int position_3019 = 2;
		head_3019 = deleteNode_3019(head_3019, position_3019);
		// Print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_3019(head_3019) ;

	}

}
