package generic;

public class AccountGeneric<T extends Integer,P> {

    private T id;
    private P sum;

    public AccountGeneric() {
    }

    public AccountGeneric(T id, P sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public P getSum() {
        return sum;
    }

    public void setSum(P sum) {
        this.sum = sum;
    }
}
