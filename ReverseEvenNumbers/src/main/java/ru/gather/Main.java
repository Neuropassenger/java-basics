package ru.gather;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by turge on 018 18.10.16.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static void reverseEvenNumbers(InputStream in, OutputStream out) throws IOException {
        Deque<Integer> stack = new LinkedList<Integer>();
        Scanner scan = new Scanner(in);
        DataOutputStream dout = new DataOutputStream(out);

        boolean even = false;
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                if (even == false) {
                    stack.push(scan.nextInt());
                    even = true;
                } else {
                    scan.nextInt();
                    even = false;
                }
            } else {
                scan.next();
            }
        }

        while (stack.size() > 0) {
            dout.writeInt(stack.pop());
        }
        /*
        boolean even = false;
        do {
            if(scan.hasNextInt() == false)
                scan.next();
            if (even == false) {
                stack.push(scan.nextInt());
                even = true;
            } else {
                scan.nextInt();
                even = false;
            }
        } while(scan.hasNext());

        while (stack.size() > 0) {
            dout.writeInt(stack.pop());
        }
        */
    }
}
