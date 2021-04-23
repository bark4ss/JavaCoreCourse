package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerrializationAppl {

	public static void main(String[] args) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personSerialized.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personSerialized.txt"));
				) {
			Person person = new Person("Ivan", 32, 180, false, new Position("developer", 500));
			oos.writeObject(person);
			System.out.println(person);
			person.setName("Dima");
			System.out.println(person);
			Person serializedPerson = (Person) ois.readObject();
			System.out.println(serializedPerson);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
