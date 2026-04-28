package Pekan4_2511533019;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q_3019= new LinkedList<>();
		q_3019.add ("Praktikum");
		q_3019.add ("Struktur");
		q_3019.add ("Data");
		q_3019.add ("Dan");
		q_3019.add ("Algoritma");
		Iterator<String> iterator_3019 = q_3019.iterator();
		while (iterator_3019.hasNext ()) {
			System.out.print (iterator_3019.next() + " ");
		}
	}

}
