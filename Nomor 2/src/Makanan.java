public class Makanan extends Menu {

    public Makanan(int id) {
        super(id);
        this.nama = "Nasi Goreng";
        this.harga = 15000;
    }
    public Makanan(int id, String nama, int harga) {
        super(id);
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }

    @Override
    public int hitungTotalHarga(int jumlah) {
        int totalHarga = harga * jumlah;
        return totalHarga;
    }

    public int hitungTotalHarga() {
        int Harga = harga;
        return Harga;
    }
}
