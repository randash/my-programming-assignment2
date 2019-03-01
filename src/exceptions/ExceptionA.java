
package exceptions;

public class ExceptionA extends Exception {

    public ExceptionA() {
    }

    public ExceptionA(String msg) {
        super(msg);
        System.out.println("Error\nExceptionA");
    }
}
