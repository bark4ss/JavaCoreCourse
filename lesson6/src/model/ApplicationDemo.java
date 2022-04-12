package model;

public class ApplicationDemo {
    public static void main(String[] args) {
        Figure rec = new Rectangle(4,5);
        Figure rec2 = new Triangle(4,5,6);
        print(rec);
        Book book = new Book(300, 1000, "Author1", "Book1");
        Journal journal = new Journal("Journal1", 500);
        PrintCenter center = new PrintCenter(journal);
        center.print();
    }

    public static void print(Figure rec){
        System.out.println(rec.countSquare());
    }
}
