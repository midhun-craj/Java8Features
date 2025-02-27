package serializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationExample {
    public static void main(String[] args) {
        try {
            Person person = new Person("Midhun C Raj", 23, "midhun");
            FileOutputStream fileOut = new FileOutputStream("serialized.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
