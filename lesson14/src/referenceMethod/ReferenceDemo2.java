package referenceMethod;

import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReferenceDemo2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Nick", "Boll"));
        users.add(new User("Jan", "Nicky"));
        users.add(new User("Bot", "Smart"));

        users.sort(Comparator.comparing(User::getName));
        users.forEach(System.out::println);
    }
}
