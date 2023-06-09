package interface1;

import java.util.Scanner;

interface Akun {
    public void login();
    public void daftar();
}

class Person implements Akun{
    Scanner input = new Scanner(System.in);

    String nama;
    Person(String nama){
        this.nama = nama;
    }

    public void login(){
        System.out.print("Username: ");
        input.nextLine();
        System.out.print("Password: ");
        input.nextLine();
    }
    public void daftar(){
        System.out.print("Username: ");
        input.nextLine();
        System.out.print("Password: ");
        input.nextLine();
        System.out.print("Konfirmasi password: ");
        input.nextLine();
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nama");
        person1.login();
    }
}