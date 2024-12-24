package main;


public class EvenOddGuesser {

    /**
     * AF:
     *  (module) is the guess of the module given n access ot a dataset.
     *  (learningRate) is the rate that the ia is gonna learn the dataset
     * ---------------
     * RI:
     *  module != 0
     *  learningRate > 0
     *  learningRate < 1
     */

    /** Starting guess of the module */
    private float module = 116498436;
    /**Learning rate */
    private final float learningRate = 0.9f;


    /**
     * Given a {@code DataSetValue} improves the approximation of its {@code module}
     * @param dsv
     */
    public void improve(DataSet dsv, int value){
        module += learningRate*(dsv.modulo(value)-guess(value));
    }

    /**
     * Guess the module of the value.
     * @param value The value to be checked
     * @return {@code value % this.module} 
     */
    public float guess(int value){
        return (value % module);
    }

    @Override
    public String toString() {
        return "module: " + module;
    }
    
    
}
