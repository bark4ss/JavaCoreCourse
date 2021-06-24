package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoAppl1 {
    public static void main(String[] args) {
        List<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }
    }
}
