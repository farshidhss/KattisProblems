package com.kattis;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;

public class HelloWorld {
    public static void main(String[] args) {
        PrintWriter o = new PrintWriter(new BufferedOutputStream(System.out));
        o.println("Hello World!");
        o.close();
    }
}
