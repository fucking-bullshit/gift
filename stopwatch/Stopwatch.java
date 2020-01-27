package stopwatch;
/**
 * Stopwatch to compute elapsed time.
 * @author Nutta Sittipongpanich
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** boolean that represent the status of stopwatch*/
	private boolean running;
    /** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	
	public Stopwatch() {
		this.running = false;
	}

	/**
	 * Start the stopwatch if it is not already running.
	 */
	public void start() {
		if (this.running != true){
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}

	/**
	 * Stop the stopwatch if it is running.
	 */
	public void stop() {
		if (this.running != false){
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}

	/**
	 * Compute the elapsed time while stopwatch is running.
	 * @return the elapsed time in seconds
	 */
	public double getElapsed() {
		double elapsed;
		if (this.running == true){
			elapsed = (System.nanoTime() - this.startTime) * NANOSECONDS;
	    }
		else{
			elapsed = (this.stopTime - this.startTime) * NANOSECONDS;
		}
		return elapsed;
    }

	/**
	 * Test if the stopwatch is running.
	 * @return true if stopwatch is running
	 */
	public boolean isRunning() {
		return this.running;
	}

	/**
	 * Describe the stopwatch.
	 */
	public String toString() {
		return "Stopwatch is " + (running? "running" : "stopped");
	}
}
