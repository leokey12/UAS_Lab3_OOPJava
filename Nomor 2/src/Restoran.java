import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Restoran {
    private List<Menu> daftarMenu;

    public Restoran() {
        daftarMenu = new ArrayList<>();
        daftarMenu.add(new Makanan(1));
        daftarMenu.add(new Makanan(2, "Mie Goreng", 12000));
        daftarMenu.add(new Minuman(3, "Teh Manis", 5000, "Kecil"));
        daftarMenu.add(new Minuman(4));
        daftarMenu.add(new Minuman(5, "Teh Manis", 10000, "Besar"));
        daftarMenu.add(new Minuman(6, "Jus Jeruk", 8000));
    }

    private void tampilkanDaftarMenu() {
        System.out.println("===== Daftar Menu =====");
        for (Menu menu : daftarMenu) {
            menu.tampilkanMenu();
            System.out.println("=======================");
        }
    }

    public void pesanMenu() {
        int totalHarga = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Berapa jenis makanan/munuman yang ingin dipesan? ");
            int jumlahJenis = scanner.nextInt();

            for (int i = 0; i < jumlahJenis; i++) {
                System.out.print("Masukkan ID menu yang ingin dipesan: ");
                int id = scanner.nextInt();
                System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
                int jumlah = scanner.nextInt();

                Menu menu = cariMenu(id);
                if (menu != null) {
                    System.out.println("Anda memesan: " + jumlah + " " + menu.getNama());
                    int Harga = menu.hitungTotalHarga(jumlah);
                    totalHarga += Harga;
                    System.out.println("Harga: " + Harga);
                } else {
                    System.out.println("Menu dengan ID " + id + " tidak ditemukan.");
                }
            }
        System.out.println("Total Harga: "+ totalHarga);
        }catch(Exception e){
            System.out.println("Terjadi kesalahan, harap input dengan benar");
        }
    }

    private Menu cariMenu(int id) {
        for (Menu menu : daftarMenu) {
            if (menu.getId() == id) {
                return menu;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Restoran restoran = new Restoran();
        restoran.tampilkanDaftarMenu();
        restoran.pesanMenu();
    }
}
