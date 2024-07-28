import static java.lang.System.out;

static class Fibonocci{
    int a = 0;
    int b = 1;
    int c;

    public void fib(int n){
        System.out.println("The fibonocci Series is as follows: ");
        for (int i=0; i<n; i++){
            System.out.print(a+",");
            c = a + b;
            a = b;
            b = c;
            
        }
        
    }
}

public static void main(String[] args) {
    Fibonocci fibb = new Fibonocci();
    fibb.fib(10);
}
