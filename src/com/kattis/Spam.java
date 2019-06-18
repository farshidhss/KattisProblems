package com.kattis;

import com.kattis.utility.InputReader;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Spam {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> asciiMap = new HashMap<>();
        asciiMap.put('_', 0);
        asciiMap.put('\n', 4);
        for (int i = 0; i < 33; i++) {
            asciiMap.put((char) i, 4);
        }
        for (int i = 33; i < 48; i++) {
            asciiMap.put((char) i, 3);
        }
        for (int i = 48; i < 58; i++) {
            asciiMap.put((char) i, 3);
        }
        for (int i = 58; i < 65; i++) {
            asciiMap.put((char) i, 3);
        }
        for (int i = 65; i < 91; i++) {
            asciiMap.put((char) i, 2);
        }
        for (int i = 91; i < 95; i++) {
            asciiMap.put((char) i, 3);
        }
        for (int i = 96; i < 97; i++) {
            asciiMap.put((char) i, 3);
        }
        for (int i = 97; i < 123; i++) {
            asciiMap.put((char) i, 1);
        }
        for (int i = 123; i < 127; i++) {
            asciiMap.put((char) i, 3);
        }

        int[] counts = new int[] { 0, 0, 0, 0, 0 };

        PrintWriter o = new PrintWriter(new BufferedOutputStream(System.out));
        InputReader io = new InputReader();
        String line = io.readLine();

        for (int i = 0; i < line.length(); i++)
            counts[asciiMap.get(line.charAt(i))]++;
        o.println((double) counts[0] / (line.length()));
        o.println((double) counts[1] / (line.length()));
        o.println((double) counts[2] / (line.length()));
        o.println((double) counts[3] / (line.length()));
        o.flush();
    }
}