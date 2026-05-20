package pekan7_2511533019;

public class ADTMahasiswa_2511533019 {
	private String namaMahasiswa_3019;
	private String Nim_3019;
	private String Prodi_3019;
	
	//construktor
	public ADTMahasiswa_2511533019(String namaMahasiswa_3019, String Nim_3019, String Prodi_3019) {
		this.namaMahasiswa_3019=namaMahasiswa_3019;
		this.Nim_3019=Nim_3019;
		this.Prodi_3019=Prodi_3019;
	}
	
	//getter
	public String getNamaMahasiswa_3019() {
		return namaMahasiswa_3019;
	}
	public String getNim_3019() {
		return Nim_3019;
	}
	public String getProdi_3019() {
		return Prodi_3019;
	}
	
	//setter
	public void setNamaMahasiswa_2511533019() {
		this.namaMahasiswa_3019=namaMahasiswa_3019;
	}
	public void setNim_3019() {
		this.Nim_3019=Nim_3019;
	}
	public void setProdi_3019() {
		this.Prodi_3019=Prodi_3019;
	}
	
	@Override
	public String toString() {
		return namaMahasiswa_3019+ " | " + Nim_3019 + Prodi_3019;
	}
}
