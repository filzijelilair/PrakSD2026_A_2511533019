package Pekan5_2511533019;

public class Pasien_2511533019 {
		String NamaPasien_3019;
		String keluhan_3019;
		int noAntrian_3019;
		//pointer ke node pasien berikutnya
		Pasien_2511533019 next_3019;
		//konstruktor menginisialisasi node dengan data
		public Pasien_2511533019(String NamaPasien_3019, String keluhan_3019, int noAntrian_3019) {
			this.NamaPasien_3019= NamaPasien_3019;
			this.keluhan_3019=keluhan_3019;
			this.noAntrian_3019= noAntrian_3019;
			this.next_3019 = next_3019;
		}
		//getter
		public String getNamaPasien_3019() {
			return NamaPasien_3019;
		}
		public String getkeluhan_3019() {
			return keluhan_3019;
		}
		public int getnoAntrian_3019() {
			return noAntrian_3019;
		}
		public Pasien_2511533019 getnext_3019() {
			return next_3019;
		}
		//setter
		public void setNamaPasien_3019(String NamaPasien_3019) {
			this.NamaPasien_3019= NamaPasien_3019;
		}
		
		public void setkeluhan_3019(String keluhan_3019) {
			this.keluhan_3019= keluhan_3019;
		}
		
		public void setnoAntrian_3019(int noAntrian_3019) {
			this.noAntrian_3019=noAntrian_3019;
		}
		
		public void setnext_3019(Pasien_2511533019 next_3019) {
			this.next_3019= next_3019;
		}
}
