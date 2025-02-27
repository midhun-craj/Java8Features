package transientExample;

import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String gender;
    transient String password;

    public User(String name, int age, String gender, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(encrypt(password));
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        password = decrypt((String) in.readObject());
    }

    private static String encrypt(String password) {
        return "ENC(" + password + ")";
    }

    private static String decrypt(String encryptedPassword) {
        return encryptedPassword.replace("ENC(", "").replace(")", "");
    }
}
