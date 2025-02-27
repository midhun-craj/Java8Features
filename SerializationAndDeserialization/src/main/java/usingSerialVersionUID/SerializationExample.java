package usingSerialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("usingUID.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            Person3 person3 = new Person3("Devu", 20, "devu");
            out.writeObject(person3);
            out.close();
            fileOut.close();
            System.out.println("Class Serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
