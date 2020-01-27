package stopwatch;
/**
 * Add Double objects using an array.
 */
public class Task2 {
    private int limit;
    private Double[] array;

    public Task2(int limit) {
        this.limit = limit;
        // initialize the array with values 1 ... limit+1
        this.array = new Double[limit];
        for(int k = 0; k < array.length; k++) 
            array[k] = Double.valueOf(k+1);
    }

    /**
     * Sum values of the array.
     */
    public void run() {
        Double sum = 0.0;
        for(int k = 0; k < array.length; k++)
            sum += array[k];
        System.out.println("the sum is "+sum);
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("Sum an array of %,d Double objects",limit);
    }
}
