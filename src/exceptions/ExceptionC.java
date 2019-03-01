
package exceptions;

public class ExceptionC extends ExceptionB {

    public ExceptionC() {
    }

    public ExceptionC(String msg) {
        super(msg);
        System.out.println("Error\nExceptionC");
    }
}
