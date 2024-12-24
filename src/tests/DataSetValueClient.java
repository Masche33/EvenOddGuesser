package tests;

import main.DataSet;

public class DataSetValueClient {
    

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            DataSet ds = new DataSet(i);
            System.out.println(ds);
        }
        long duration = (System.nanoTime()- start)/1000000;
        System.out.println(duration +" ms");
        
    }
}
