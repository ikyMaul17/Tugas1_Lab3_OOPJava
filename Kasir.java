import java.sql.SQLOutput;

public class Kasir {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;

    // Overloading Constructor
    public Kasir() {
        this("", 0, 0);
    }

    public Kasir(String namaBarang, int hargaBarang) {
        this(namaBarang, hargaBarang, 0);
    }

    public Kasir(String namaBarang, int hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    // Overloading Method
    public int hitungTotal() {
        return hargaBarang * jumlahBarang;
    }

    public int hitungTotal(int diskon) {
        int total = hitungTotal();
        return total - (total * diskon / 100);
    }

    public void tampilkanNota() {
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Barang\t: " + hargaBarang);
        System.out.println("Jumlah Barang\t: " + jumlahBarang);
        System.out.println("Total Harga\t: " + hitungTotal());
    }

    public void tampilkanNota(int diskon) {
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Barang\t: " + hargaBarang);
        System.out.println("Jumlah Barang\t: " + jumlahBarang);
        System.out.println("Total Harga\t: " + hitungTotal(diskon));
        System.out.println("Diskon\t: " + diskon + "%");
        System.out.println("Total Bayar\t: " + hitungTotal(diskon));

    }
}