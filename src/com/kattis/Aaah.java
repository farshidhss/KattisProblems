package com.kattis;

import com.kattis.utility.Kattio;

public class Aaah {
    public static void main(String[] args) {

        Kattio io = new Kattio(System.in, System.out);
        while (io.hasMoreTokens()) {
            String line1 = io.getWord();
            String line2 = io.getWord();

            if (line1.length() >= line2.length()) {
                io.println("go");
                io.flush();
            } else {
                io.println("no");
                io.flush();
            }
        }
        io.close();
    }
}
