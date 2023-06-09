package thread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Proses1();
        Thread thread2 = new Proses2();
        thread1.start();
        thread2.start();
    }
}

class Proses1 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(5000);
            } catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Gambar " + i);
        }
    }
}

class Proses2 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<25; i++){
            try {
                Thread.sleep(500);
            } catch(Exception e) {
                System.out.println(e);
            }
            System.out.println("Pesan " + i);
        }
    }
}
