package pekan3_2511533019;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533019 {
	static Stack<Website_2511533019> history = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== Browser History NIM : 2511533019 ===");
            System.out.println("1.Kunjungi Website");
            System.out.println("2.Tombol Back");
            System.out.println("3.Lihat Halaman Aktif");
            System.out.println("4.Cek History");
            System.out.println("5.Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();
            
         switch (pilihan) {
         	case 1:
         		System.out.print("Masukkan Judul: ");
         		String judul = input.nextLine();
         		System.out.println("Masukkan URL: ");
         		String url = input.nextLine();

         		history.push(new Website_2511533019(judul, url));
         		System.out.println("Berhasil mengunjungi halaman web!");
         		break;

         	case 2:
         		if (!history.isEmpty()) {
         			Website_2511533019 removed = history.pop();
         			System.out.println("back from : " + removed.getJudul_3019());
         		} else {
         			System.out.println("History kosong!!");
         		}break;

         	case 3:
         		if (!history.isEmpty()) {
         			Website_2511533019 top = history.peek();
         			System.out.println("Halaman saat ini:");
         			System.out.println("Judul: " + top.getJudul_3019());
         			System.out.println("URL: " + top.getURL_3019());
         		} else {
         			System.out.println("Kosong!");
         		}break;

         	case 4:
         		System.out.println("Jumlah history: " + history.size());
         		break;
         }
        }while(pilihan !=5);
	}

}
