package lesson11.serialization;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.Serializable;

public class Position implements Serializable{
	private String name;
	private int salary;
	
	public Position(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Position [name=" + name + ", salary=" + salary + "]";
	}
	
	public void readObject (Person p) throws IOException {
		throw new NotSerializableException();
	}

}
