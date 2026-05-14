package Pekan6_2511533019;

import java.util.Scanner;

public class Musik_2511533019 {

	// tambah lagu di akhir
	public static Lagu_2511533019 tambahLagu_3019(Lagu_2511533019 head_3019, String judul_3019, String penyanyi_3019) {

		Lagu_2511533019 laguBaru_3019 = new Lagu_2511533019(judul_3019, penyanyi_3019);

		// jika kosong jadi head
		if(head_3019 == null) {
			return laguBaru_3019;
		}
		// menuju node terakhir
		Lagu_2511533019 last_3019 = head_3019;
		while(last_3019.next_3019 != null) {
			last_3019 = last_3019.next_3019;
		}
		last_3019.next_3019 = laguBaru_3019;
		laguBaru_3019.prev_3019 = last_3019;
		return head_3019;
	}
	// hapus lagu awal
	public static Lagu_2511533019 hapusLaguAwal_3019(Lagu_2511533019 head_3019){
		if(head_3019 == null){
			System.out.println("Playlist kosong");
			return null;
		}

		System.out.println("Lagu dihapus : " + head_3019.judul_3019);
		head_3019 = head_3019.next_3019;

		if(head_3019 != null){
			head_3019.prev_3019 = null;
		}
		return head_3019;
	}
	// tampil maju
	public static void tampilMaju_3019(Lagu_2511533019 head_3019){
		if(head_3019 == null){
			System.out.println("Playlist kosong");
			return;
		}
		Lagu_2511533019 curr_3019 = head_3019;
		int noUrut_3019 = 1;

		while(curr_3019 != null){
			System.out.println(noUrut_3019 + ". "+ curr_3019.judul_3019+ " - "	+ curr_3019.penyanyi_3019);
			curr_3019 = curr_3019.next_3019;
			noUrut_3019++;
		}
	}
	// tampil mundur
	public static void tampilMundur_3019(Lagu_2511533019 head_3019){
		if(head_3019 == null){
			System.out.println("Playlist kosong");
			return;
		}
		Lagu_2511533019 curr_3019 = head_3019;
		int noUrut_3019=1;
		
		while(curr_3019.next_3019 != null){
			curr_3019 = curr_3019.next_3019;
		}
		while(curr_3019 != null){
			System.out.println(noUrut_3019+ " . " +curr_3019.judul_3019 + " - " + curr_3019.penyanyi_3019);
			curr_3019 = curr_3019.prev_3019; 
			noUrut_3019++;}
	}
	// cari lagu
	public static boolean cariLagu_3019(Lagu_2511533019 head_3019, String cari_3019){
		Lagu_2511533019 curr_3019 = head_3019;
		while(curr_3019 != null){
			if(curr_3019.judul_3019.equalsIgnoreCase(cari_3019)){
				System.out.println("Lagu ditemukan");
				System.out.println(curr_3019.judul_3019 + " - " + curr_3019.penyanyi_3019);
				return true;
			}
			curr_3019 = curr_3019.next_3019;
		}
		System.out.println("Lagu tidak ditemukan");
		return false;
	}

	public static void main(String[] args) {
		Scanner input_3019 = new Scanner(System.in);
		Lagu_2511533019 head_3019 = null;
		int pilih_3019;
		do {
			System.out.println("\n=== Playlist Musik NIM : 2511533019 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari Lagu");
			System.out.println("6. Keluar");
			System.out.print("Pilihan : ");
			pilih_3019 = input_3019.nextInt();
			input_3019.nextLine();

			switch(pilih_3019){
			case 1:
				System.out.print("Judul : ");
				String judul_3019 = input_3019.nextLine();
				System.out.print("Penyanyi : ");
				String penyanyi_3019 = input_3019.nextLine();
				head_3019 = tambahLagu_3019(head_3019, judul_3019, penyanyi_3019);
				System.out.println("Lagu berhasil ditambahkan");
				break;
			case 2:
				head_3019 = hapusLaguAwal_3019(head_3019);
				break;
			case 3:
				tampilMaju_3019(head_3019);
				break;
			case 4:
				tampilMundur_3019(head_3019);
				break;
			case 5:
				System.out.print("Masukkan judul lagu : ");
				String cari_3019 = input_3019.nextLine();
				cariLagu_3019(head_3019, cari_3019);
				break;
			case 6:
				System.out.println("Program selesai");
				break;
			default:
				System.out.println("Pilihan salah");
			}
			
		} while(pilih_3019 != 6);
		input_3019.close();
	}
}