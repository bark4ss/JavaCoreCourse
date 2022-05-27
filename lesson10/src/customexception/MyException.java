package customexception;

public class MyException extends Exception {
    private int detail;
    private StatusCode statusCode;

    public MyException(int a) {
        detail = a;
    }

    public MyException(StatusCode code) {
        this.statusCode = code;
    }

    public StatusCode getStatusCode() {
        return this.statusCode;
    }

    public int getDetail() {
        return detail;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
