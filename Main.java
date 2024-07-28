import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());
        public static void main (String [] args) {
            System.out.println("java is boring, i Have to do it anyway");
            log.info("Calling the calc program");
            Calculator calc = new Calculator();
            calc.add(2,4);
        }
}
