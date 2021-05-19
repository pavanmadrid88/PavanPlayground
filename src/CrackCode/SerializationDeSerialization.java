package CrackCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDeSerialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Test t1 = new Test();
		
		//SERIALIZE
		FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(t1);
		
		
		//DE-SERIALIZE
		FileInputStream fileInputStream = new FileInputStream("test.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Test t2 = (Test)objectInputStream.readObject();
		
		System.out.println("T2 I:" + t2.i + "  " + " T2 J :" + t2.j);
		
		
		
		
	}

}

class Test implements Serializable{
	
	int i=100;
	int j=200;
}
