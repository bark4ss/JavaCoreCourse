package testAppl;

import java.util.ArrayList;
import java.util.List;

public class ReferenceDemo {
    //https://habr.com/ru/company/otus/blog/551026/
    List<Integer> list;
    ReferenceDemo() {
        list = new ArrayList<>();
        someVoid(list);
    }

    void someVoid(List<Integer> l) {
        l.add(0);
    }

    public static void main(String[] args) {
        ReferenceDemo demo = new ReferenceDemo();
        System.out.println("Size is: " + demo.list.size());
    }
}
