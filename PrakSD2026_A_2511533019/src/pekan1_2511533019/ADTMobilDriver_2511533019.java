package pekan1_2511533019;
import java.util.Scanner;
import java.util.ArrayList;

public class ADTMobilDriver_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        ArrayList<ADTMobil_2511533019> dataMobil = new ArrayList<>();

        System.out.println("=== Program ADT Mobil ===");

        // input mobil
        System.out.print("Masukkan jumlah mobil: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mobil ke-" + (i+1));

            System.out.print("Nama Mobil: ");
            String nama = input.nextLine();

            System.out.print("Tahun: ");
            int tahun = input.nextInt();

            System.out.print("cc: ");
            int cc = input.nextInt();

            System.out.print("Harga: ");
            double harga = input.nextDouble();
            input.nextLine();

            System.out.print("Merk: ");
            String merk = input.nextLine();

            ADTMobil_2511533019 m = new ADTMobil_2511533019(nama, tahun, cc, harga, merk);
            dataMobil.add(m);
        }

        // tampilin data
        System.out.println("\n=== Daftar Mobil ===");
        for (ADTMobil_2511533019 m : dataMobil) {
            System.out.println(m);
            System.out.println("Pajak: " + m.hitungPajak());
            System.out.println("----------------------");
        }

        // hapus mobil
        System.out.print("\nMasukkan no urutan mobil yang ingin dihapus (mulai dari 0): ");
        int idx = input.nextInt();

        if (idx >= 0 && idx < dataMobil.size()) {
            dataMobil.remove(idx);
            System.out.println("Mobil berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }

        // tampilin ulang
        System.out.println("\n=== Data Setelah Hapus ===");
        for (ADTMobil_2511533019 m : dataMobil) {
            System.out.println(m);
        }

        input.close();
	}

}
