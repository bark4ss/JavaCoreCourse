package customexception;

public class MyException extends Exception {
    private int detail;
    public MyException(int a) {
        detail = a;
    }

    public int getDetail() {
        return detail;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
