package serialization;

import java.io.*;

public class SerrializationApplDemo2 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personSerialized.txt"))
        ) {
            Person serializedPerson = (Person) ois.readObject();
            System.out.println(serializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
