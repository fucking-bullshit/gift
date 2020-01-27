package stopwatch;
/**
 * Add double values using an array.
 */
public class Task1 {
    private int limit;
    private double[] array;

    public Task1(int limit) {
        this.limit = limit;
        // initialize the array with values 1 ... limit+1
        this.array = new double[limit];
        for(int k = 0; k < array.length; k++)
            array[k] = k + 1;
    }

    /**
     * Sum values of the array.
     */
    public void run() {
        Double sum = 0.0;
        for(int k=0; k<array.length; k++) 
            sum += array[k];
        String result = String.format("The sum is %,.2f", sum);
        System.out.println(result);
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("Sum an array of %,d double values",limit);
    }
}
