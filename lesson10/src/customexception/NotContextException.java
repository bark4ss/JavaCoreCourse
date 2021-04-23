package customexception;

public class NotContextException extends Exception{
    public NotContextException() {
    }

    public NotContextException(String message) {
        super(message);
    }

    public NotContextException(Throwable cause) {
        super(cause);
    }
}
