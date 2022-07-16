/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 26-05-2022
Time: 14:06
File: SlowAndFastPointer.java */
package hackerrank;

public class SortedArrangements {
    int solution(int[] a) {
        int count = 0;
        int first = a[0];
        int sec = a[1];
        int third = a[2];

        for (int i = 2; i < a.length; i++) {
            if (first == sec && first != third) {
                count++;
            } else if (first == third && first != sec) {
                count++;
            }
            else if (sec == third && first != sec) {
                count++;
            }
        }
        return count;
    }
}