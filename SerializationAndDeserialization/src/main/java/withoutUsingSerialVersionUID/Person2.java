package withoutUsingSerialVersionUID;

import java.io.Serializable;

class Person2 implements Serializable {
    String name;
    int age;
    String gender;
    String password;

    public Person2(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
