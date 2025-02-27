package transientExample;

import java.io.*;

class SerializationExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("transient.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            User user = new User("Midhun", 23, "male", "midhun");
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println("Serialization complete.");

            FileInputStream fileIn = new FileInputStream("transient.json");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User user1 = (User) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialization complete.");
            System.out.println("Name: " + user1.name + " Age: " + user1.age + " Gender: " + user1.gender + " Password: " + user1.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
