package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// serialized convert state of the object in to byte stream

		String fileName = "employee.ser"; // file will be generate in javatest
											// (project) folder

		//serializeObject(fileName);
		deserializeObject(fileName);
	}

	private static void serializeObject(String fileName) {
		Address address = new Address(1111, "address Line1", "address Line2",
				"Mumbai", 590999);
		Employee employee = new Employee(1001, "KK", 30,
				"kishan.javatrainer@gmail.com", "pass@123", address);

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File(fileName)))) {

			oos.writeObject(employee);
			System.out.println("Object is serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deserializeObject(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File(fileName)))) {
			Object object = ois.readObject();
			Employee emp = (Employee) object;
			System.out.println(emp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}


