package com.example.android.javajoketeller;

import java.util.Random;

public class JokeTeller {

    static String jokes[];
    static Random random;

    public JokeTeller() {
        jokes = new String[3];
        jokes[0] = "Q: What's programmers favourit place?\n" +
                "\n" +
                "A: Foo Bar";
        jokes[1] = "Q: \"What do you call a programmer from Filland\"\n" +
                "\n" +
                "A: Nerdic";;
        jokes[2] = "Q: \"Whats the object-oriented way to become wealthy?\"\n" +
                "\n" +
                "A: Inheritance";
        random = new Random();
    }

    public static String getRandomJoke() {
        return jokes[random.nextInt(3)];
    }


}
