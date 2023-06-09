package eksepsi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            String username = input.nextLine();
            String password = input.nextLine();
            if(username.length() > 20 || password.length() > 20){
                throw new Exception("Jumlah maksimal karakter adalah 20");
            }
        } catch(Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Pengecekan selesai");
        }
    }
}