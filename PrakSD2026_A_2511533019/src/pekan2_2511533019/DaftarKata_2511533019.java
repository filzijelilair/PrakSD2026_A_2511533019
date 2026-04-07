package pekan2_2511533019;

import java.util.ArrayList;

public class DaftarKata_2511533019 {
	
	private final ArrayList<String> data;
	//konstruktor : inisialisasi list kosong
	public DaftarKata_2511533019() {
		this.data = new ArrayList<>();
	}
	/** Menambahkan elemen di akhir list. */
	public void tambah_2511533019(String elemen) {
		data.add(elemen);
	}
	/** Menambahkan elemen pada indekx tertentu (menyisipkan). */
	public void tambahPada_2511533019(int index, String elemen) {
		data.add(index, elemen);
	}
	/** 
	 * Mengubah elemen pada posisi 'indeks' menjadi 'nilaiBaru'.
	 * Bertindak sebagai "setter" untuk elemen tertentu.
	 * @param args
	 */
	public void ubahElemen_2511533019(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	/** Menghapus elemen pada posisi 'index' dan mengembalikan nilai dihapus.
	 * @param args
	 */
	public String hapusElemen_2511533019(int index) {
		return data.remove (index);
	}
	/** 
	 * Melakukan iterasi dan mencetak setiap elemen dalm format: [index] nilai
	 * (Metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi).
	 * @param args
	 */
	public void iterasiCetak_2511533019() {
		for (int i = 0; i<data.size(); i++) {
			System.out.print(data.get(i)+ " ");
		}
	}
	/*** Mengambil elemen berdasarkan indeks. */
	public String get(int index) {
		return data.get(index);
	}
	
	//Representasi string agar mudah dicetak 
	public String toString() {
		return data.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
