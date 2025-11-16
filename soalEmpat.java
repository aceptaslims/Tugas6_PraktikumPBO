package Pertemuan6;

import java.util.Scanner;

public class soalEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input.nextInt();
        input.nextLine();

        String[] nama = new String[jml];
        int[] nilai = new int[jml];
        String[] status = new String[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("\nMahasiswa ke-" + (i+1));
            System.out.print("Nama: ");
            nama[i] = input.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();
            input.nextLine();

            status[i] = (nilai[i] > 50) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("No\tNama\t\tNilai\tStatus");
        for (int i = 0; i < jml; i++) {
            System.out.printf("%d\t%s\t\t%d\t%s\n", (i+1), nama[i], nilai[i], status[i]);
        }
    }
}

