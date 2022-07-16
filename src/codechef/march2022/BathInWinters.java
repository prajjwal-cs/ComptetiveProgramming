/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 11-03-2022
Time: 18:03
File: BathInWinters.java */
package codechef.march2022;

import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                int geyserCapacity = sc.nextInt();
                int bucketCapacity = sc.nextInt();

                int onePersonBath = 2 * bucketCapacity;
                int maxNumber = 0;

                if (geyserCapacity >= onePersonBath) {
                    maxNumber = geyserCapacity / onePersonBath;
                }
                else {
                    maxNumber = 0;
                }
                System.out.println(maxNumber);
            }
        } catch (Exception e) {
            return;
        }
    }
}