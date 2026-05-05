package Pekan5_2511533019;

public class PencarianSLL_2511533019 {
	static boolean searchKey_3019(NodeSLL_2511533019 head_3019, int key_3019) {
		NodeSLL_2511533019 curr = head_3019;
		while (curr != null) {
				if (curr.data_3019 == key_3019)
					return true;
				curr = curr.next_3019;}
		return false; }
	public static void traversal_3019(NodeSLL_2511533019 head_3019) {
		//mulai dari head
		NodeSLL_2511533019 curr = head_3019;
		//telusuri sampai pointer null
		while (curr != null) {
			System.out.print(" " + curr.data_3019);
			curr = curr.next_3019; }
		System.out.println(); }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			NodeSLL_2511533019 head_3019 = new NodeSLL_2511533019(14);
			head_3019.next_3019 = new NodeSLL_2511533019(21);
			head_3019.next_3019.next_3019 = new NodeSLL_2511533019(13);
			head_3019.next_3019.next_3019.next_3019 = new NodeSLL_2511533019(30);
			head_3019.next_3019.next_3019.next_3019.next_3019 = new NodeSLL_2511533019(10);
			System.out.print("Penelusuran SLL : ");
			traversal_3019(head_3019);
			//data yang akan dicari
			int key_3019= 30;
			System.out.print("cari data "+key_3019+ " = ");
			if (searchKey_3019(head_3019, key_3019))
				System.out.println("ketemu");
			else
				System.out.println("tidak ada");
		}}