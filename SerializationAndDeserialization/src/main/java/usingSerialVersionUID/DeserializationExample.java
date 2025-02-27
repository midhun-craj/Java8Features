package usingSerialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("usingUID.json");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person3 person3 = (Person3) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Class Deserialized.");
            System.out.println("Name: " + person3.name + " Age: " + person3.age + " password: " + person3.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
