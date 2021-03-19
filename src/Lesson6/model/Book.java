package Lesson6.model;

public class Book implements Printable {
    private int countPages;
    private int price;
    private String author;
    private String title;

    public Book() {
    }

    public Book(int countPages, int price, String author, String title) {
        this.countPages = countPages;
        this.price = price;
        this.author = author;
        this.title = title;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(this.title + " " + this.price);
    }
}
