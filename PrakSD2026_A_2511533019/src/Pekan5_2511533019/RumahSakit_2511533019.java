package Pekan5_2511533019;

public class RumahSakit_2511533019 {
	public static Pasien_2511533019 insertPasien_3019(Pasien_2511533019 head_3019, String NamaPasien_3019, String keluhan_3019, int noAntrian_3019) {
		Pasien_2511533019 pasienBaru_3019 = new Pasien_2511533019(NamaPasien_3019, keluhan_3019, noAntrian_3019);
	//jika list kosong maka node jadi head
	if(head_3019 == null) {
		return pasienBaru_3019;
		}
	// menuju node terakhir
	Pasien_2511533019 last_3019 = head_3019;
		while (last_3019.next_3019 != null) {
		last_3019 = last_3019.next_3019;
		}
		// hubungkan node baru
		last_3019.next_3019 = pasienBaru_3019;
		return head_3019;
	}
	// method tampil antrian
	public static void display_3019(Pasien_2511533019 head_3019) {
		Pasien_2511533019 curr_3019 = head_3019;
		int noAntrian_3019 = 1;
		while (curr_3019 != null) {
			System.out.println(noAntrian_3019 + ". "+ curr_3019.NamaPasien_3019 + " "+ curr_3019.keluhan_3019);
			curr_3019 = curr_3019.next_3019;
			noAntrian_3019++;
		}
	}

	// method panggil pasien(delete head)
	public static Pasien_2511533019 panggilPasien_3019(Pasien_2511533019 head_3019) {
		if (head_3019 == null) {
			System.out.println("Antrian kosong");
			return null;
		}		
		System.out.println("Pasien dipanggil : "+ head_3019.NamaPasien_3019);
		head_3019 = head_3019.next_3019;
		return head_3019;
	}
	// method cari pasien
	public static boolean cariPasien_3019(Pasien_2511533019 head_3019,String namaCari_3019) {
		Pasien_2511533019 curr_3019 = head_3019;
			while (curr_3019 != null) {
				if (curr_3019.NamaPasien_3019.equalsIgnoreCase(namaCari_3019)) {
					System.out.println("Pasien ditemukan");
					System.out.println(curr_3019.noAntrian_3019 + " "+ curr_3019.NamaPasien_3019 + " "+ curr_3019.keluhan_3019);
					return true;
				}
				curr_3019 = curr_3019.next_3019;
			}
		System.out.println("Pasien tidak ditemukan");
		return false;
	}
	// method cek status antrian
	public static void cekStatus_3019(Pasien_2511533019 head_3019) {
		if (head_3019 == null) {
			System.out.println("Antrian kosong");
			return;
		}
		int jumlah_3019 = 0;
		Pasien_2511533019 curr_3019 = head_3019;
			while (curr_3019 != null) {
				jumlah_3019++;
				curr_3019 = curr_3019.next_3019;
			}
			System.out.println("Jumlah pasien dalam antrian : "+ jumlah_3019);
			System.out.println("Pasien terdepan : "+ head_3019.NamaPasien_3019);
			}

	public static void main(String[] args) {
		Pasien_2511533019 head_3019 = null;
		System.out.println("=== Antrian Rumah Sakit NIM: 2511533019 ===");
		System.out.println("1.Daftarkan Pasien (Insert)");
		System.out.println("2.Panggil Pasien (Delete Head)");
		System.out.println("3.Tampilkan Antrian (Display)");
		System.out.println("4.Cari Pasien (Search)");
		System.out.println("5.Cek Status Antrian");
		System.out.println("6.Keluar");
		//pasien pertama
		System.out.println("\nPilihan: 1");
		System.out.println("Masukkan Nama Pasien : Budi Santoso");
		System.out.println("Masukkan Keluhan     : Demam");
		head_3019 = new Pasien_2511533019("Budi Santoso", "Demam",1);
		System.out.println("Pasien berhasil didaftarkan! No Antrian: 1");

		// pasien kedua
		System.out.println("\nPilihan: 1");
		System.out.println("Masukkan Nama Pasien : Sinta");
		System.out.println("Masukkan Keluhan     : Influenza");
		head_3019.next_3019 = new Pasien_2511533019("Sinta","Influenza",2);
		System.out.println("Pasien berhasil didaftarkan! No Antrian: 2");

		// pasien ketiga
		System.out.println("\nPilihan: 1");
		System.out.println("Masukkan Nama Pasien : Andi");
		System.out.println("Masukkan Keluhan     : Gastritis");
		head_3019.next_3019.next_3019 = new Pasien_2511533019("Andi","Gastritis",3);
		System.out.println("Pasien berhasil didaftarkan! No Antrian: 3");

		// tampil antrian
		System.out.println("\nPilihan: 3");
		System.out.println("Daftar Antrian:");
		display_3019(head_3019);

		// cari pasien
		System.out.println("\nPilihan: 4");
		System.out.println("Cari Pasien : Sinta");
		cariPasien_3019(head_3019, "Sinta");

		// cek status
		System.out.println("\nPilihan: 5");
		cekStatus_3019(head_3019);

		// panggil pasien
		System.out.println("\nPilihan: 2");
		head_3019 = panggilPasien_3019(head_3019);

		// tampil antrian lagi
		System.out.println("\nPilihan: 3");
		System.out.println("Daftar Antrian:");
		display_3019(head_3019);
		System.out.println("\nPilihan: 6");
		System.out.println("Program selesai");
	}
}