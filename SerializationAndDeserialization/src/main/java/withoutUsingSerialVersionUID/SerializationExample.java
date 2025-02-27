package withoutUsingSerialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("withoutUID.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            Person2 person2 = new Person2("Malavika C Raj", 22, "malu");
            out.writeObject(person2);
            out.close();
            fileOut.close();
            System.out.println("Class Serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
