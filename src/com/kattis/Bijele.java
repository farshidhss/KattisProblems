package com.kattis;

import com.kattis.utility.Kattio;

public class Bijele {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        while (io.hasMoreTokens()) {
            io.print(1 - io.getInt() + " ");
            io.print(1 - io.getInt() + " ");
            io.print(2 - io.getInt() + " ");
            io.print(2 - io.getInt() + " ");
            io.print(2 - io.getInt() + " ");
            io.println(8 - io.getInt());
            io.flush();
        }
        io.close();
    }

}

