package serializationAndDeserialization;

import java.io.Serializable;

class Person implements Serializable {
    String name;
    int age;
    String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
