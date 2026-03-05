public class Sampah {

    private String namaJenis;
    private String satuan;
    private double harga;

    // Constructor
    public Sampah(String namaJenis, String satuan, double harga) {
        this.namaJenis = namaJenis;
        this.satuan = satuan;
        this.harga = harga;
    }

    // Method update harga
    public void updateHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Getter
    public double getHarga() {
        return harga;
    }

    public String getNamaJenis() {
        return namaJenis;
    }
}