public class Transaksi {

    private String tanggal;
    private int idTransaksi;
    private double beratSampah;
    private double totalNominal;

    private Nasabah nasabah;
    private Sampah sampah;

    // Constructor
    public Transaksi(String tanggal, int idTransaksi, double beratSampah,
                     Nasabah nasabah, Sampah sampah) {

        this.tanggal = tanggal;
        this.idTransaksi = idTransaksi;
        this.beratSampah = beratSampah;
        this.nasabah = nasabah;
        this.sampah = sampah;

        this.totalNominal = hitungTotal();

        // otomatis tambah saldo nasabah
        nasabah.tambahSaldo(this.totalNominal);
    }

    // Hitung total transaksi
    public double hitungTotal() {
        return beratSampah * sampah.getHarga();
    }

    // Tampilkan transaksi
    public void tampilkanTransaksi() {
        System.out.println("=== Detail Transaksi ===");
        System.out.println("Tanggal: " + tanggal);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Nasabah: " + nasabah.getNama());
        System.out.println("Jenis Sampah: " + sampah.getNamaJenis());
        System.out.println("Berat: " + beratSampah + " kg");
        System.out.println("Total: Rp " + totalNominal);
    }
}