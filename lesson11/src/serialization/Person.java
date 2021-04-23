package serialization;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static String nickName = "agent007";
		
	private String name;
	private int age;
	private int height;
	private boolean married;
	private Position pos;

	public Person(String name, int age, int height, boolean married, Position pos) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.married = married;
		this.pos = pos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
        throw new NotSerializableException();
    }


}
