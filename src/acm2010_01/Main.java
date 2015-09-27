/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm2010_01;

import java.util.Scanner;

/**
 *
 * @author Christopher Wells
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Variables
         */
        String line;        // Next line read in
        int totalWeight;    // Total weight of bananas
        int numberApes;     // Total number of apes
        int apesCounted = 0;
        int weightCarried = 0;  // Weight currently being carried
        
        int carry;
        int loss;
        
        // Scanner
        Scanner kb = new Scanner(System.in);
        
        /**
         * Take in input and process it
         */
        
        // Banana weight and ape number
        line = kb.nextLine();
        totalWeight = Integer.parseInt(line.substring(0, 1));
        numberApes = Integer.parseInt(line.substring(1, 2));
        
        // Information on each monkey
        Monkey[] monkeyList = new Monkey[numberApes];
        while(apesCounted < numberApes) {
            // Read in carry and loss
            carry = kb.nextInt();
            loss = kb.nextInt();
            
            monkeyList[apesCounted] = new Monkey(carry, loss);
            apesCounted++;
        }
        
        // Figure out which monkeys will carry bananas
        //while(weightCarried < totalWeight) {
        //}
        
        /**
         * Output solution
         */
        apesCounted = 0;
        while(apesCounted < numberApes) {
            System.out.printf(monkeyList[apesCounted].picked + " ");
            apesCounted++;
        }
    }
    
}
