package Pekan4_2511533019;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_3019 = new LinkedList<>();
		//tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++)
			q_3019.add(i);
		//menampilkan isi antrian.
		int hapus_3019 = q_3019.remove();
		System.out.println("Hapus elemen = " + hapus_3019);
		System.out.println(q_3019);
		//untuk melihat antrian terdpn
		int depan_3019= q_3019.peek();
		System.out.println("Kepala Antrian = "+ depan_3019);
		int banyak_3019 = q_3019.size();
		System.out.println("Size Antrian = " + banyak_3019);
	}

}
