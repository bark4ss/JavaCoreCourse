package xmlbinding.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Office> offices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", offices=" + offices +
                '}';
    }
}
