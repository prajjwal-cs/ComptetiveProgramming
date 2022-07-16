/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-03-2022
Time: 18:16
File: Wordle.java */
package codechef.march2022;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                String str1 = sc.next();
                String str2 = sc.next();

                StringBuilder str3 = new StringBuilder();

                for (int i = 0; i < 5; i++) {
                    if(str1.charAt(i) == str2.charAt(i)) {
                        str3.append("G");
                    }
                    else {
                        str3.append("B");
                    }
                }
                System.out.println(str3);
            }
        } catch (Exception e) {
            return;
        }
    }
}