public class Main {
    public static void main(String[] args) {

        Nasabah nasabah1 = new Nasabah("Andi", 1001, "Jl. Melati No.10");

        Sampah plastik = new Sampah("Plastik", "kg", 5000);
        Sampah kertas = new Sampah("Kertas", "kg", 3000);

        Transaksi transaksi1 = new Transaksi("04-03-2026", 1, 2.5, nasabah1, plastik);
        Transaksi transaksi2 = new Transaksi("04-03-2026", 2, 3.0, nasabah1, kertas);

        transaksi1.tampilkanTransaksi();
        System.out.println();

        transaksi2.tampilkanTransaksi();
        System.out.println();

        nasabah1.tampilkanProfil();
    }
}