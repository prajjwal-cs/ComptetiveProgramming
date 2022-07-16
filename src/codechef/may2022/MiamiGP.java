/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 06-05-2022
Time: 21:52
File: MiamiGP.java 

*/

package codechef.may2022;

import java.util.Scanner;

public class MiamiGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            double ans = (107.0 * x) / 100.0;
            if(ans >= y) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}