package ru.gather;

import java.io.*;
import java.util.Scanner;

/**
 * Created by turge on 012 12.10.16.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static void sumOfRealNumbers(InputStream in, OutputStream out) throws IOException {
        double result = 0;
        Scanner scan = new Scanner(in);

        while(scan.hasNext()) {
            if (scan.hasNextDouble())
                result += scan.nextDouble();
            else
                scan.next();
        }


        PrintStream pOut = new PrintStream(out);
        pOut.printf("%.6f", result);
    }
}
