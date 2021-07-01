package functionalinterface.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        //https://www.examclouds.com/java/java-core-russian/supplier-interface-russian
        String t = "One";
        Supplier<String> supplierStr = () -> t.toUpperCase();
        Supplier<Integer> supplierIntr = () -> new Random().nextInt(1000);
        System.out.println(supplierStr.get());
        int b = supplierIntr.get();
    }
}
