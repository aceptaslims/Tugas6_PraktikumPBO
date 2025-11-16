package Pertemuan6;
    class MyThread extends Thread {
    private String nama;

    public MyThread(String nama) {
        this.nama = nama;
    }

    @Override
    public void run() {
        System.out.println("Thread berjalan: " + nama);
    }
}

public class soalDelapan {
    public static void main(String[] args) {
        // Thread utama
        System.out.println("Ini adalah thread utama!");

        // Membuat beberapa thread anak
        for (int i = 1; i <= 5; i++) {   // bisa diubah jumlahnya
            MyThread t = new MyThread("Thread Anak " + i);
            t.start();
        }
    }
}

