package Pertemuan6;

import java.util.Scanner;

public class soalTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // jumlah elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        // input elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        // nilai terbesar & terkecil
        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }
        }

        System.out.println("Nilai terbesar: " + max + " (index " + idxMax + ")");
        System.out.println("Nilai terkecil: " + min + " (index " + idxMin + ")");

        // jumlah total + rata-rata
        int total = 0;
        for (int x : arr) total += x;
        double rata = (double) total / n;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rata);

        // jumlah indeks ganjil
        int sumGanjil = 0;
        for (int i = 1; i < n; i += 2)
            sumGanjil += arr[i];

        // jumlah indeks genap
        int sumGenap = 0;
        for (int i = 0; i < n; i += 2)
            sumGenap += arr[i];

        // cek ganjil / genap
        String cek = (total % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Total adalah: " + cek);

        // urutkan array
        java.util.Arrays.sort(arr);
        System.out.println("Array terurut:");
        for (int x : arr) System.out.println(x);
    }
}


