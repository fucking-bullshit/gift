package stopwatch;
/**
 * Time the tasks and display results.
 */
public class Main {

    public static void main(String[] args) {
        //Task 1 : Find Sum values of the array use double value
        Stopwatch sw1 = new Stopwatch();       
        Task1 task1 = new Task1(1_000_000);
        System.out.println( task1 );
        sw1.start();
        task1.run();
        sw1.stop();
        System.out.printf("Elapsed time %.6f sec\n", sw1.getElapsed());

        //Task 2 : Find Sum values of the array use Double objects
        Stopwatch sw2 = new Stopwatch();       
        Task2 task2 = new Task2(1_000_000);
        System.out.println( task2 );
        sw2.start();
        task2.run();
        sw2.stop();
        System.out.printf("Elapsed time %.6f sec\n", sw2.getElapsed());

        //Task 3 : Find Sum values of the array use BigDecimal objects
        Stopwatch sw3 = new Stopwatch();
        Task3 task3 = new Task3(1_000_000);
        System.out.println("\n" + task3);
        sw3.start();
        task3.run();
        sw3.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", sw3.getElapsed());

        //Task 4 : Find length of the Unicode characters from (char)65
        Stopwatch sw4 = new Stopwatch();
        Task4 task4 = new Task4(65_000);
        System.out.println("\n" + task4);
        sw4.start();
        task4.run();
        sw4.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", sw4.getElapsed());

        //Task 5 : Find length of the Unicode characters from (char)65, use StringBuilder,
        // then convert to String
        Stopwatch sw5 = new Stopwatch();
        Task5 task5 = new Task5(65_000);
        System.out.println("\n" + task5);
        sw5.start();
        task5.run();
        sw5.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", sw5.getElapsed());
    }
}
