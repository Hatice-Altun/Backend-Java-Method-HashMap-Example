package com.altun.Java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// A HashMap example of my favorite singers

        Map<Integer, String> singers = new HashMap<>();
        singers.put(1, "Jennifer Lopez");
        singers.put(2, "Aaliyah");
        singers.put(3, "Adele");
        singers.put(4, "Christina Aguilera");
        singers.put(5, "Sertab Erener");
        singers.put(6, "Selena Gomez");
        singers.put(7, "Lady Gaga");
        singers.put(8, "Ariana Grande");
        singers.put(9, "Madonna");
        singers.put(10, "Whitney Houston");
        singers.put(11, "Alicia Keys");
        singers.put(12, "Beyonce Knowles");
        singers.put(13, "Katy Perry");
        singers.put(14, "Pink");
        singers.put(15, "Rihanna");
        singers.put(16, "Shakira");
        singers.put(17, "Britney Spears");
        singers.put(18, "Tina Turner");

        System.out.println("The Grammy Award winner is " + singers.get(7) + "!");
        System.out.println(singers.get(9) + " is watching!");
        System.out.println("How many singers are in the HashMap: " + singers.size());
        singers.remove(18);
        System.out.println("How many singers are left in the HashMap: " + singers.size());
        singers.clear();
        System.out.println("How many singers are now left in the HasMap: " + singers.size());

    }
}
