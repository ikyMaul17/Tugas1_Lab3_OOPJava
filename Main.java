public class Main {
    public static void main(String[] args) {
        // Membuat objek kasir
        Kasir kasir1 = new Kasir("Buku", 10000, 2);

        // Menampilkan nota tanpa diskon
        kasir1.tampilkanNota();

        // Menampilkan nota dengan diskon 10%
        kasir1.tampilkanNota(10);
    }
}