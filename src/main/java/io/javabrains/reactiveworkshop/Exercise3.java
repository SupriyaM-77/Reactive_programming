package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here
        List<Integer> num = ReactiveSources.intNumbersFlux().toStream().toList();
        System.out.println("List is " + num);
        System.out.println("size is " + num.size());


        System.out.println("Press a key to end");
        System.in.read();
    }

}
