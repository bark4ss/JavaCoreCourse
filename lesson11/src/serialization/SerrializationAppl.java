package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//https://metanit.com/java/tutorial/6.10.php

public class SerrializationAppl {

	public static void main(String[] args) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personSerialized.txt"))) {
			Person person = new Person("Ivan", 36, 180, true, new Position("developer", 500));
			oos.writeObject(person);
			System.out.println(person);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
