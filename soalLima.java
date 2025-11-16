package Pertemuan6;

import java.util.Scanner;

public class soalLima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] matriks = new int[baris][kolom];
        int total = 0;

        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("M[%d][%d] = ", i, j);
                matriks[i][j] = input.nextInt();
                total += matriks[i][j];
            }
        }

        System.out.println("Total penjumlahan elemen matriks = " + total);
    }
}

