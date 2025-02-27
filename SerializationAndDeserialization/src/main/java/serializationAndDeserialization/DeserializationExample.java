package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializationExample {
    public static void main(String[] args) {
       try {
           FileInputStream fileIn = new FileInputStream("serialized.json");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           Person person = (Person) in.readObject();
           in.close();
           fileIn.close();
           System.out.println("Object deserialized.");
           System.out.println("Name: " + person.name + " Age: " + person.age + " Password: " + person.password);
       } catch(IOException | ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}
