package pekan2_2511533019;

public class DaftarKataDriver_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaftarKata_2511533019 al = new DaftarKata_2511533019();
		
		// Menambah elemen (akhir)
		al.tambah_2511533019("Kami"); 
		al.tambah_2511533019 ("Informatika");
		
		// Menyisipkan elemen pada indeks 1
		al.tambahPada_2511533019(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println ("Awal   : " + al);
		
		// Mengubah elemen (index 1)
		al.ubahElemen_2511533019 (1, "Departemen");
		System.out.println ("Setelah Ubah : " + al);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511533019(0);
		System.out.println ("Terhapus :" + terhapus);
		System.out.println ("Setelah Hapus : " + al) ;
		
		// Iterasi pada Arraylist (cetak setiap elemen)
		System.out.print ("Iterasi : ");
		al.iterasiCetak_2511533019();
		System.out.println();
	}

}
