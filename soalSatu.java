package Pertemuan6;

import java.util.ArrayList;

public class soalSatu {
    public static void main(String[] args) {
        //tiga variasi sintaks array
        
        //array yang tidak diketahui jumlahnya
        int [] angka={1,2,3};
        for(int n : angka){
            System.out.println(n);
        }
        
        //array yang diketahui batasan nya
        int[] data = new int [3];
        data[0]=4;
        data[1]=5;
        data[2]=6;
        for(int j : data){
            System.out.println(j);
        }
        
        //array list
        ArrayList<Integer> number = new ArrayList<>();
        number.add(7);
        number.add(8);
        number.add(9);
        for(int k : number){
            System.out.println();
        }
    }
}
