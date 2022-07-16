/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 06-07-2022
Time: 12:10
File: Main.java */
package dynamicprogramming;

public class Main {
    public static void main(String[] args) {
        int[] x = {5, 6, 7, 8, 9};
        int[] y = x;
        y[2] = 10;
        System.out.print(x[2]);
        System.out.println(y[2]);
    }
}