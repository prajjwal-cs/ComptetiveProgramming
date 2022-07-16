/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-03-2022
Time: 17:42
File: march2022.java */
package codechef.march2022;

import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                int throw1 = sc.nextInt();
                int throw2 = sc.nextInt();
                int throw3 = sc.nextInt();
                int longThrow;

                if (throw1 >= throw2 && throw1 >= throw3) {
                    longThrow = throw1;
                }
                else if (throw2 >= throw1 && throw2 >= throw3) {
                    longThrow = throw2;
                }
                else
                    longThrow = throw3;

                System.out.println(longThrow);
            }
        } catch (Exception e) {
            return;
        }
    }
}