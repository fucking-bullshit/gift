package stopwatch;

/**
 * Append the Unicode characters from (char)65 to limit to a String, then the length of the String.
 */
public class Task4 {
    private int limit;
    private String text = "";

    public Task4(int limit) {
        this.limit = limit;
        for(int k = 65; k < this.limit; k++) {
            this.text += (char) k;
        }
    }

    /**
     * print the length of the String.
     */
    public void run() {
        String leng = String.format("String length is %,d", this.text.length());
        System.out.println(leng);
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("Append the Unicode characters from (char)65 to (char)%,d to a String, then the length of the String.",limit);
    }
}
