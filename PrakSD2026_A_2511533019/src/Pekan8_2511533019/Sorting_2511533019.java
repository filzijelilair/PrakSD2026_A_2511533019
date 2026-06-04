package Pekan8_2511533019;

import java.util.Scanner;

public class Sorting_2511533019 {

    // array menyimpan data lagu
    static Lagu_2511533019[] dataLagu_3019 = new Lagu_2511533019[20];
    // byk lagu yang digunakan
    static int jumlahData_3019 = 7;
    // Method mengisi data lagu
    public static void inputData_3019() {
    	 dataLagu_3019[0] = new Lagu_2511533019("Joyride", "Cortis", 195);
    	 dataLagu_3019[1] = new Lagu_2511533019("Almost Is Never Enough", "Ariana Grande", 327);
    	 dataLagu_3019[2] = new Lagu_2511533019("Merry Christmas, I Miss You", "Alex Crichton", 247);
    	 dataLagu_3019[3] = new Lagu_2511533019("Wonderwall", "Oasis", 258);
    	 dataLagu_3019[4] = new Lagu_2511533019("Acai Bowl", "Cortis", 210);
    	 dataLagu_3019[5] = new Lagu_2511533019("Monokrom", "Tulus", 230);
    	 dataLagu_3019[6] = new Lagu_2511533019("Komang", "Raim Laode", 220);
    }
    // method untuk menampilkan data lagu
    public static void tampilData_3019() {
        for (int i_3019 = 0; i_3019 < jumlahData_3019; i_3019++) {
            System.out.println((i_3019 + 1) + ". "+ dataLagu_3019[i_3019].judul_3019 + " - "
                    + dataLagu_3019[i_3019].penyanyi_3019 + " - "
                    + dataLagu_3019[i_3019].durasi_3019 + " detik");
        }
    }
    // shell sort
    public static void shellSort_3019() {
        int n_3019 = jumlahData_3019;
        // nentuin gap
        for (int gap_3019 = n_3019 / 2; gap_3019 > 0; gap_3019 /= 2) {
        	for (int i_3019 = gap_3019; i_3019 < n_3019; i_3019++) {
                Lagu_2511533019 temp_3019 = dataLagu_3019[i_3019];
                int j_3019 = i_3019;
                
                // membandingkan judul lagu
                while (j_3019 >= gap_3019 &&
                        dataLagu_3019[j_3019 - gap_3019].judul_3019.compareToIgnoreCase(temp_3019.judul_3019) > 0) {
                	dataLagu_3019[j_3019] = dataLagu_3019[j_3019 - gap_3019];
                    j_3019 -= gap_3019;
                }
                dataLagu_3019[j_3019] = temp_3019;
            }
        }
    }

    // quick sort
    public static int partition_3019(int low_3019, int high_3019) {
        int pivot_3019 = dataLagu_3019[high_3019].durasi_3019;
        int i_3019 = low_3019 - 1;
        for (int j_3019 = low_3019; j_3019 < high_3019; j_3019++) {
            // Membandingkan durasi lagu dengan pivot
            if (dataLagu_3019[j_3019].durasi_3019 < pivot_3019) {
                i_3019++;
                Lagu_2511533019 temp_3019 = dataLagu_3019[i_3019];
                dataLagu_3019[i_3019] = dataLagu_3019[j_3019];
                dataLagu_3019[j_3019] = temp_3019;
            }
        }

        // Menempatkan pivot pada posisi yang benar
        Lagu_2511533019 temp_3019 = dataLagu_3019[i_3019 + 1];
        dataLagu_3019[i_3019 + 1] = dataLagu_3019[high_3019];
        dataLagu_3019[high_3019] = temp_3019;
        return i_3019 + 1;
    }
    // Method quick sort
    public static void quickSort_3019(int low_3019, int high_3019) {
        if (low_3019 < high_3019) {
            int pi_3019 = partition_3019(low_3019, high_3019);
            quickSort_3019(low_3019, pi_3019 - 1);
            quickSort_3019(pi_3019 + 1, high_3019);
        }
    }
    //merge sort
    public static void merge_3019(int kiri_3019, int tengah_3019, int kanan_3019) {
        int n1_3019 = tengah_3019 - kiri_3019 + 1;
        int n2_3019 = kanan_3019 - tengah_3019;
        Lagu_2511533019[] L_3019 = new Lagu_2511533019[n1_3019];
        Lagu_2511533019[] R_3019 = new Lagu_2511533019[n2_3019];

        for (int i_3019 = 0; i_3019 < n1_3019; i_3019++) {
            L_3019[i_3019] = dataLagu_3019[kiri_3019 + i_3019];
        }
        for (int j_3019 = 0; j_3019 < n2_3019; j_3019++) {
            R_3019[j_3019] = dataLagu_3019[tengah_3019 + 1 + j_3019];
        }
        int i_3019 = 0;
        int j_3019 = 0;
        int k_3019 = kiri_3019;
        
        while (i_3019 < n1_3019 && j_3019 < n2_3019) {

            if (L_3019[i_3019].judul_3019.compareToIgnoreCase(
                    R_3019[j_3019].judul_3019) <= 0) {
                dataLagu_3019[k_3019] = L_3019[i_3019];
                i_3019++;
            } else {
                dataLagu_3019[k_3019] = R_3019[j_3019];
                j_3019++;
            }
            k_3019++;
        }
        // Menyalin sisa elemen array kiri
        while (i_3019 < n1_3019) {
            dataLagu_3019[k_3019++] = L_3019[i_3019++];
        }
        // Menyalin sisa elemen array kanan
        while (j_3019 < n2_3019) {
            dataLagu_3019[k_3019++] = R_3019[j_3019++];
        }
    }
    // Method Merge Sort
    public static void mergeSort_3019(int kiri_3019, int kanan_3019) {
        if (kiri_3019 < kanan_3019) {
            int tengah_3019 = (kiri_3019 + kanan_3019) / 2;
            mergeSort_3019(kiri_3019, tengah_3019);
            mergeSort_3019(tengah_3019 + 1, kanan_3019);
            merge_3019(kiri_3019, tengah_3019, kanan_3019);
        }
    }
    //main program
    public static void main(String[] args) {
        Scanner input_3019 = new Scanner(System.in);
        inputData_3019();
        // Menampilkan menu pilihan algoritma
        System.out.println("=== Sorting Playlist Lagu ===");
        System.out.println("1. Shell Sort (Judul A-Z)");
        System.out.println("2. Quick Sort (Durasi Asc)");
        System.out.println("3. Merge Sort (Judul A-Z)");
        System.out.print("Pilih Algoritma : ");
        int pilihan_3019 = input_3019.nextInt();
        // Menampilkan data sebelum sorting
        System.out.println("\nData Sebelum Sorting:");
        tampilData_3019();
        switch (pilihan_3019) {
            case 1:
                shellSort_3019();
                System.out.println("\nData Setelah Shell Sort:");
                break;
            case 2:
                quickSort_3019(0, jumlahData_3019 - 1);
                System.out.println("\nData Setelah Quick Sort:");
                break;
            case 3:
                mergeSort_3019(0, jumlahData_3019 - 1);
                System.out.println("\nData Setelah Merge Sort:");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        // Menampilkan hasil sorting
        tampilData_3019();
        input_3019.close();
    }
}