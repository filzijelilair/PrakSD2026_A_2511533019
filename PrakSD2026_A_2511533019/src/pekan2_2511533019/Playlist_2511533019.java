package pekan2_2511533019;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533019 {

    private final ArrayList<Musik_2511533019> data;

    public Playlist_2511533019() {
        this.data = new ArrayList<>();
    }

    public void tambah_2511533019(Musik_2511533019 lagu) {
        data.add(lagu);
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampil_2511533019() {
        if (data.isEmpty()) {
            System.out.println("Playlist kosong!");
        } else {
            for (int i = 0; i < data.size(); i++) {
                Musik_2511533019 lagu = data.get(i);
                System.out.println((i + 1) + ". " +
                        lagu.getJudul_3019() + " - " +
                        lagu.getPenyanyi_3019() +
                        " (" + lagu.getDurasi_3019() + " detik)");
            }
        }
    }

    public void hapus_2511533019(int index) {
        if (index > 0 && index <= data.size()) {
            data.remove(index - 1);
            System.out.println("Lagu berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }
    
    public void cekJumlah_2511533019() {
        System.out.println("Jumlah lagu: " + data.size());
    }
    
    public static void main(String[] args) {

        Playlist_2511533019 pl = new Playlist_2511533019();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511533019 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();
                    input.nextLine();

                    pl.tambah_2511533019(new Musik_2511533019(judul, penyanyi, durasi));
                    break;

                case 2:
                    pl.tampil_2511533019();
                    break;

                case 3:
                    System.out.print("Masukkan nomor lagu: ");
                    int index = input.nextInt();
                    input.nextLine();
                    pl.hapus_2511533019(index);
                    break;
                    
                case 4:
                	pl.cekJumlah_2511533019();
                	break;
            }

        }while (pilihan !=5);
    }
}