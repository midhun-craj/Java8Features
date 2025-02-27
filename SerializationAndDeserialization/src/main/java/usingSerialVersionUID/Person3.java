package usingSerialVersionUID;

import java.io.Serializable;

class Person3 implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String password;

    public Person3(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
