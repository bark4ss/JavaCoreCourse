package lesson12.generic;

import java.util.Objects;

public class Account {

    private int id;
    private String sum;

    public Account() {
    }

    public Account(int id, String sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(sum, account.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sum);
    }
}
