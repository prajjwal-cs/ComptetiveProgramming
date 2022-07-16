/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 12-03-2022
Time: 19:16
File: AkashAndFunction.java */
package codechef.march2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AkashAndFunction {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                n++;
                int res = n>>>1;
                System.out.println(res);
            }
        } catch (Exception e) {
            return;
        }
    }
}