package jsonmarshalling.model;

import java.time.LocalDate;

public class Book {
    private String name;
    private LocalDate date;

    public Book(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
