package Pertemuan6;

import java.util.ArrayList;

public class soalSepuluh {
     public static void main(String[] args) {
        ArrayList<Object> test = new ArrayList<>();
        test.add(19);
        test.add(0.2);
        test.add("C");
        test.add("java");
        test.add(true);
        for(Object n : test){
            System.out.print(n +" ");
        }
        
    }
}
