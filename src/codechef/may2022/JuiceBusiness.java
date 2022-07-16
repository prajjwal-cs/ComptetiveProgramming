/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 06-05-2022
Time: 21:57
File: JuiceBusiness.java 

*/

package codechef.may2022;

import java.util.Scanner;

public class JuiceBusiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int total = n * 50;

            float cane = total * 0.2f;
            float salt = total * 0.2f;
            float rent = total * 0.3f;

            float res = cane + salt + rent;
            int profit = (int) (total - res);
            System.out.println(profit);
        }
    }
}