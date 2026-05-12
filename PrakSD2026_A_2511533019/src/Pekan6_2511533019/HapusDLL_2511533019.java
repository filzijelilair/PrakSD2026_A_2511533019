package Pekan6_2511533019;

public class HapusDLL_2511533019 {
	//fungsi menghapus node awal
	public static NodeDLL_2511533019 delHead_3019 (NodeDLL_2511533019 head_3019) {
		if (head_3019 == null) { 
			return null;}
		NodeDLL_2511533019 temp_3019 = head_3019;
		head_3019 = head_3019.next_3019;
		if (head_3019!= null) {
			head_3019.prev_3019 = null;
		}
		return head_3019;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511533019 delLast_3019(NodeDLL_2511533019 head_3019) {
		if (head_3019 == null) {
		return null;
		}
		if (head_3019.next_3019 == null) {
			return null; }
		NodeDLL_2511533019 curr_3019 = head_3019;
		while (curr_3019.next_3019 != null) {
		curr_3019 = curr_3019.next_3019;
		}
		//update pointer previous node
		if (curr_3019.prev_3019 != null) {
			curr_3019.prev_3019.next_3019 = null; 
		}
		return head_3019;
	}
	//fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533019 delPos_3019 (NodeDLL_2511533019 head_3019, int pos_3019) {
		//jika DLL kosong
		if(head_3019 == null) {
			return head_3019; }
		NodeDLL_2511533019 curr_3019 = head_3019;
		// telusuri sampai ke node yang akan dihapus 
		for (int i_3019 = 1; curr_3019 != null && i_3019 < pos_3019; ++i_3019) {
		curr_3019 = curr_3019.next_3019;	}
		// jika posisi tidak ditemukan
		if (curr_3019 == null) { 
			return head_3019;
		}
		// Update pointer
		if (curr_3019.prev_3019 != null) {
		curr_3019.prev_3019.next_3019 = curr_3019.next_3019; }
		if (curr_3019.next_3019 != null) {
		curr_3019.next_3019.prev_3019 = curr_3019.prev_3019; }
		//jika yang dihapus head 
		if (head_3019 == curr_3019) {
			head_3019 = curr_3019.next_3019; }
		return head_3019;
	}
	//fungsi mencetak DLL
	public static void printlist_3019 (NodeDLL_2511533019 head_3019) {
		NodeDLL_2511533019 curr_3019 = head_3019;
		while (curr_3019 != null) {
				System.out.print (curr_3019.data_3019 + " <-> ");
				curr_3019 = curr_3019.next_3019;
		}
		System.out.println ();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// buat sebuah DLL
		NodeDLL_2511533019 head_3019= new NodeDLL_2511533019(1);
		head_3019.next_3019 = new NodeDLL_2511533019(2);
		head_3019.next_3019.prev_3019 = head_3019;
		head_3019.next_3019.next_3019 = new NodeDLL_2511533019(3);
		head_3019.next_3019.next_3019.prev_3019 = head_3019.next_3019;
		head_3019.next_3019.next_3019.next_3019= new NodeDLL_2511533019(4);
		head_3019.next_3019.next_3019.next_3019.prev_3019 = head_3019.next_3019.next_3019;
		head_3019.next_3019.next_3019.next_3019.next_3019= new NodeDLL_2511533019 (5);
		head_3019.next_3019.next_3019.next_3019.next_3019.prev_3019 = head_3019.next_3019.next_3019.next_3019;
		
		System.out.print ( "DLL Awal: ");
		printlist_3019(head_3019);
		System.out.print ("Setelah head dihapus: ");
		head_3019 = delHead_3019(head_3019);
		printlist_3019 (head_3019);
		System.out.print ("Setelah node terakhir dihapus: ");
		head_3019 = delLast_3019(head_3019);
		printlist_3019(head_3019);
		System. out.print ("menghapus node ke 2: ") ;
		head_3019 = delPos_3019(head_3019, 2);
		printlist_3019(head_3019);
	}

}
