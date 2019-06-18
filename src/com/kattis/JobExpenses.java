package com.kattis;

import com.kattis.utility.InputReaderMin;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class JobExpenses {
    public static void main(String[] args) throws IOException {
        PrintWriter o = new PrintWriter(new BufferedOutputStream(System.out));
        InputReaderMin io = new InputReaderMin();
        int sum = 0, exp;
        int items;
        items = io.nextInt();
        for (int i = 0; i < items; i++) {
            try {
                exp = io.nextNegativeInt();
            } catch (IOException e) {
                break;
            }
            sum += exp;
        }
        o.println(-sum);
        o.flush();
        o.close();
    }
}
