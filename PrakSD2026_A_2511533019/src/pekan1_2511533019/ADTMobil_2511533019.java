package pekan1_2511533019;

public class ADTMobil_2511533019 {
    private String nama;
    private int tahun;
    private int cc;
    private double harga;
    private String merk;

    //Konstruktor
    public ADTMobil_2511533019(String nama, int tahun, int cc, double harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    //Selektor 
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public double getHarga() { return harga; }
    public String getMerk() { return merk; }

    // Mutator
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }
    
    // Hitung pajak 
    public double hitungPajak() {
        return harga * 0.02; 
    }

    // Bandingin harga
    public int compareHarga(ADTMobil_2511533019 other) {
        return Double.compare(this.harga, other.harga);
    }

    // Override ke string
    public String toString() {
        return "Nama: " + nama +
               ", Tahun: " + tahun +
               ", CC: " + cc +
               ", Harga: " + harga +
               ", Merk: " + merk;
    }
}