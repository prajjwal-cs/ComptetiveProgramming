/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 06-05-2022
Time: 21:41
File: FootballCup.java 

*/

package codechef.may2022;

import java.util.Scanner;

public class FootballCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == y && x>0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}