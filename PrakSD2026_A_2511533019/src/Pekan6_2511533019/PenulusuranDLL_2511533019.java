package Pekan6_2511533019;

public class PenulusuranDLL_2511533019 {
	//fungsi penelusuran maju
	static void forwardTraversal_3019(NodeDLL_2511533019 head_3019) {
		//memulai penelusuran dari head
		NodeDLL_2511533019 curr_3019 = head_3019;
		//lanjutkan sampai akhir
		while(curr_3019 != null) {
			//print data
			System.out.print(curr_3019.data_3019 + " <-> ");
			//pindah ke node berikutnya
			curr_3019 = curr_3019.next_3019;
		}
		//print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal_3019(NodeDLL_2511533019 tail_3019) {
		// mulai dari akhir
		NodeDLL_2511533019 curr_3019 = tail_3019;
		//lanjut sampai head 
		while (curr_3019!= null) { 
			//cetak data
			System.out.print(curr_3019.data_3019 + " <-> ");
			// pindah ke node sebelumnya
			curr_3019 = curr_3019.prev_3019;
		}
		//cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cetak DLL
		NodeDLL_2511533019 head_3019 = new NodeDLL_2511533019(1);
		NodeDLL_2511533019 second_3019 = new NodeDLL_2511533019(2);
		NodeDLL_2511533019 third_3019 = new NodeDLL_2511533019(3);
		
		head_3019.next_3019= second_3019;
		second_3019.prev_3019= head_3019;
		second_3019.next_3019= third_3019;
		third_3019.prev_3019= second_3019;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_3019(head_3019);
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_3019(third_3019);
	}

}
