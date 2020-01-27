package stopwatch;

/**
 * Append the Unicode characters from (char)65 to limit to a String, then the length of the String.
 */
public class Task5 {
    private int limit;
    private StringBuilder sb = new StringBuilder();

    public Task5(int limit) {
        this.limit = limit;
        for(int k = 65; k < this.limit; k++) {
            sb.append( (char)k );
        }
    }

    /**
     * print the length of the String.
     */
    public void run() {
        String result = sb.toString();
        String leng = String.format("String length is %,d", result.length());
        System.out.println(leng);
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("Append the Unicode characters from (char)65 to (char)%,d to a String, then the length of the String.",limit);
    }
}