package stopwatch;

/**
 * Search decimal of the value pi at the input position
 */
public class Task6 {
    private int position;
    private String pie;

    public Task6(int position) {
        this.position = position;
        this.pie = String.format("%.100000000f", Math.PI);
        
        for (i :)
    }

    /**
     * 
     */
    public void run() {
        System.out.println(this.position);
        System.out.println(this.pie);
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("", null);
    }

    public static void main(String[] args) {
        Task6 t = new Task6(100);
        t.run();
    }
}