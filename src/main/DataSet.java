package main;

/**
 * The {@code immutable} representation of a DataSet.
 * <p>It consist in a integer {@code value} and the method to see if the value is {@code even} or {@code odd}.
 */
public class DataSet {

    /**
     * AF:
     *  modulo: Represent the modulo of this dataset
     * 
     * ---------------------------------------------
     * RI:
     *  modulo != 0
     * 
     */

    /** The value of {@code this}.*/
    private final int modulo;

    /**
     * Creates an instance of {@code DataSet} given a number.
     * @param value an integer.
     */
    public DataSet(int value){
        this.modulo = value;
    }

    /**
     * Getter of {@code this.value}.
     * @return {@code this.value}.
     */
    public int secretValue(){
        return modulo;
    }

    /**
     * Check is the value of {@code this} is {@code even} or {@code odd}.
     * @return {@code True} iff {@code this.value} is {@code even}.
     */
    public int modulo(int value){
        return value%modulo;
    }

    @Override
    public String toString() {
        return "The secret number is " + modulo; 
    }
}
