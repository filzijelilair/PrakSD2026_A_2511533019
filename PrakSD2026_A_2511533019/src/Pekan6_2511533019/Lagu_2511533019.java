package Pekan6_2511533019;

public class Lagu_2511533019 {
	String judul_3019;
	String penyanyi_3019;
	Lagu_2511533019 next_3019;
	Lagu_2511533019 prev_3019;

	// konstruktor
	public Lagu_2511533019(String judul_3019, String penyanyi_3019) {
		this.judul_3019 = judul_3019;
		this.penyanyi_3019 = penyanyi_3019;
		this.next_3019 = null;
		this.prev_3019 = null;
	}
	// getter
	public String getJudul_3019() {
		return judul_3019;
	}
	public String getPenyanyi_3019() {
		return penyanyi_3019;
	}
	// setter
	public void setJudul_3019(String judul_3019) {
		this.judul_3019 = judul_3019;
	}
	public void setPenyanyi_3019(String penyanyi_3019) {
		this.penyanyi_3019 = penyanyi_3019;
	}
}