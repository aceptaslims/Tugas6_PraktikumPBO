package Pertemuan6;
    class KelasThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hallo World!");
    }
}

public class soalTujuh {
    public static void main(String[] args) {
        KelasThread obj = new KelasThread();
        obj.start();
    }
}

