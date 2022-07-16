/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-03-2022
Time: 18:24
File: AkashMissingClass.java */
package codechef.march2022;

import java.util.Scanner;

public class AkashMissingClass {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int days = sc.nextInt();
                int ans = days/7;
                int x = days%7;
                if(x == 6) {
                    System.out.println(ans+1);
                }
                else {
                    System.out.println(ans);
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}