interface HitungHarga {
    int hitungTotalHarga(int jumlah);
}

public abstract class Menu implements HitungHarga {
    protected int id;
    protected String nama;
    protected int harga;

    public Menu(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
    public abstract void tampilkanMenu();
}
