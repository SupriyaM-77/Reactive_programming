package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream().forEach(e -> System.out.println(e));
        System.out.println("--------------------------------");
        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(e -> e < 5)
                .forEach(e -> System.out.println(e));
        System.out.println("--------------------------------");
        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(e -> e > 5)
                .skip(1)
                .limit(2)
                .forEach(e -> System.out.println(e));
        System.out.println("--------------------------------");
        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer value = StreamSources.intNumbersStream().filter(e -> e > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(value);
        System.out.println("--------------------------------");
        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream().forEach(user -> System.out.println(user.getFirstName()));
//or StreamSources.userStream().map (user -> user.getFirstName()).forEach(userName -> System.out.println(userName));
        System.out.println("--------------------------------");
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
                .map(user -> user.getFirstName())
                .forEach(userName -> System.out.println(userName));

    }

}
