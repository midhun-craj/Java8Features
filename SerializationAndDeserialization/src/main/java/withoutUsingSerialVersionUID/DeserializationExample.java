package withoutUsingSerialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("withoutUID.json");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person2 person2 = (Person2) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Class Deserialized.");
            System.out.println("Name: " + person2.name + " Age: " + person2.age + " password: " + person2.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
