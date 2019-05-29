package com.purima.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
       Dog d = new Dog();
       
       FileOutputStream fos = new FileOutputStream("abc.txt");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(d);
       
       
       FileInputStream fis = new FileInputStream("abc.txt");
       ObjectInputStream ois = new ObjectInputStream(fis);
       Dog d1 = (Dog) ois.readObject();
       System.out.println(d1.i);
       
       fos.close();
       oos.close();
	}

}
