package polymophosim;

class Hewan {
    public void suara() {
        System.out.println("Suara hewan");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Guk guk");
    }
}

public class Main {
    public static void panggilSuara(Hewan hewan) {
        hewan.suara();
    }

    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        panggilSuara(kucing);  // Output: Meong
        panggilSuara(anjing);  // Output: Guk guk
    }
}
