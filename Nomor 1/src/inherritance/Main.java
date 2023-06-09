package inherritance;

class Kendaraan {
    protected String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama kendaraan: " + nama);
    }
}

class Mobil extends Kendaraan {
    private String merk;

    public Mobil(String nama, String merk) {
        super(nama);
        this.merk = merk;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Merk mobil: " + merk);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza", "Toyota");
        mobil.info();
    }
}