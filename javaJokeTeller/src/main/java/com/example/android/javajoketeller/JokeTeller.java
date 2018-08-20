package com.example.android.javajoketeller;

import java.util.Random;

public class JokeTeller {

    static String jokes[];
    static Random random;

    public JokeTeller() {
        jokes = new String[3];
        jokes[0] = "Q: Why do programmers always mix up Halloween and Christmas?\n" +
                "\n" +
                "A: Because Oct 31 == Dec 25!";
        jokes[1] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
        jokes[2] = "Q: \"Whats the object-oriented way to become wealthy?\"\n" +
                "\n" +
                "A: Inheritance";
        random = new Random();
    }

    public static String getRandomJoke() {
        return jokes[random.nextInt(3)];
    }


}
