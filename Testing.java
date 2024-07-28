import java.util.logging.Logger;

public class Testing {
    private static Logger log = Logger.getLogger(Testing.class.getName());
        public static void main (String [] args) {
            System.out.println("java is boring, i Have to do it anyway");
            log.info("Calling the calc program");
            Calculator calc = new Calculator();
            calc.add(2,4);
        }
}
