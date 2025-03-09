package org.cs.methodreference;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. Reference to a Static method

        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<String> names = List.of("Alice", "Tom", "Nugget");
        // a. Using lambda
        // numbers.forEach(number -> System.out.println(number));
        // names.forEach(name -> StaticMethodClass.printName(name));

        // b. Using method reference
        numbers.forEach(System.out::println);
        names.forEach(StaticMethodClass::printName);


        // 2. Reference to an instance method of a particular object

        List<String> users = List.of("Luca", "Lebron", "Bronny");
        LoginAuth loginAuth = new LoginAuth();
        // a. Using lambda
        // users.forEach(user -> loginAuth.auth(user));

        // b. Using method reference
        users.forEach(loginAuth::auth);


        // 3. Reference to an instance method of an arbitrary object of a particular type

        List<String> footballPlayers = Arrays.asList("Neymar", "Messi", "Ronaldo", "Theiry Henry", "Micah", "Jamie");
        // a. Using lambda
        // footballPlayers.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        // System.out.println(footballPlayers);

        // b. Using method reference
        footballPlayers.sort(String::compareToIgnoreCase);
        System.out.println(footballPlayers);


        // 4. Reference to a constructor

        List<String> artists = Arrays.asList("Sam", "Sandra", "Aubrey", "Kendrik", "DrewLove");
        // a. Using lambda
        // List<Person> newArtists = artists.stream()
        //        .map(artist -> new Person(artist))
        //        .toList();
        // System.out.println(newArtists);

        // b. Using method reference
        List<Person> oldArtists = artists.stream()
                .map(Person::new)
                .toList();
        System.out.println(oldArtists);

    }
}
