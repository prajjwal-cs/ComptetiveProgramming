/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 05-07-2022
Time: 13:22
File: ThirdThreeNumber.java */
package codeforces;

import java.util.Scanner;

public class ThirdThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if(n %2 != 0) {
                System.out.println(-1);
            }
            else {
                System.out.print(+0+ " ");
                System.out.print(+0+ " ");
                System.out.println(+n/2);
            }
        }
    }
}