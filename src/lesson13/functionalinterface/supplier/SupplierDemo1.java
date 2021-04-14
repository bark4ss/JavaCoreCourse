package lesson13.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        //https://www.examclouds.com/java/java-core-russian/supplier-interface-russian
        String t = "One";
        Supplier<String> supplierStr = () -> t.toUpperCase();
        System.out.println(supplierStr.get());
    }
}
