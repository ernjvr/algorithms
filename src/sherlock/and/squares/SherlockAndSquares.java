/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.squares;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SherlockAndSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int numTests = sc.nextInt();
        for (int i = 0; i <= numTests; i++) {
            final String line = sc.nextLine();
            if (!line.isEmpty()) {
                final String[] nums = line.split("\\s");
                final int  numA = Integer.valueOf(nums[0]);
                final int  numB = Integer.valueOf(nums[1]);
                int count = 0;
                for (int j = 1; j < numB; j++) {
                    long square = j * j;
                    if (square >= numA && square <= numB) {
                        count++;
                    } else if (square > numB) {
                        break;
                    }
                }
                System.out.println(count);
            }
        }
    }
    
}
