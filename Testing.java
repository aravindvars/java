import java.util.logging.Logger;
    /**
     * This is the main method of the program. It prints a message to the console,
     * logs an info message, creates an instance of the Calculator class, and calls
     * the add method with the arguments 2 and 4.
     *
     * @param  args  the command line arguments
     */
public class Testing {
    private static Logger log = Logger.getLogger(Testing.class.getName());
        public static void main (String [] args) {
            System.out.println("java is boring, i Have to do it anyway");
            log.info("Calling the calc program");
            Calculator calc = new Calculator();
            calc.add(2,4);
        }
}
