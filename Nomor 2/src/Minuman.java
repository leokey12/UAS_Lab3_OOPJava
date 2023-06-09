public class Minuman extends Menu {
    private String ukuran;

    public Minuman(int id) {
        super(id);
        this.nama = "Teh Manis";
        this.harga = 7000;
        this.ukuran = "Sedang";
    }
    public Minuman(int id, String nama, int harga) {
        super(id);
        this.nama = nama;
        this.harga = harga;
        this.ukuran = "Sedang";
    }
    public Minuman(int id, String nama, int harga, String ukuran) {
        super(id);
        this.nama = nama;
        this.harga = harga;
        this.ukuran = ukuran;
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Ukuran: " + ukuran);
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

