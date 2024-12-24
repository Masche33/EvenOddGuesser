package tests;

import java.util.Random;
import main.DataSet;
import main.EvenOddGuesser;

public class EvenOddGuesserClient{
    
    public static final int ITERATION = 100000000;

    public static void main(String[] args){
        EvenOddGuesser ai = new EvenOddGuesser();
        Random r = new Random();
        int low = 1;
        int high = 100;
        DataSet dsv = new DataSet(r.nextInt(high-low) + low);
        for (int i = 0; i < ITERATION; i++) {
            int value = r.nextInt(high-low) + low;
            ai.improve(dsv, value);
        }
        System.out.println(ai);
        System.out.println(dsv);
    }
}