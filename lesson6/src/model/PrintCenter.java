package model;

public class PrintCenter {

    private Printable printProduct;

    public PrintCenter() {

    }

    public PrintCenter(Printable printProduct) {
        this.printProduct = printProduct;
    }

    public void print() {
        printProduct.print();
    }
}
