package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(integer -> System.out.println(integer));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(
                e -> System.out.println(e),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("complete"));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
