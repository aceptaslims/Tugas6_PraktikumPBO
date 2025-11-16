package Pertemuan6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class soalEnam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Masukkan jumlah bilangan: ");
        int jum = input.nextInt();

        for (int i = 0; i < jum; i++) {
            try {
                System.out.print("Bilangan ke-" + (i+1) + ": ");
                int angka = input.nextInt();
                list.add(angka);
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka! Program berhenti.");
                return;
            }
        }

        int total = 0;
        for (int a : list) total += a;

        double rata = (double) total / list.size();
        System.out.println("Rata-rata = " + rata);
    }
}

