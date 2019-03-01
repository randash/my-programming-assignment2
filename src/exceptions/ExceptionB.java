
package exceptions;

public class ExceptionB extends ExceptionA{

    public ExceptionB() {
    }

    public ExceptionB(String msg) {
        super(msg);
        System.out.println("Error\nExceptionB");
}


}
