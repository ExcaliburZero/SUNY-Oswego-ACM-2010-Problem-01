/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm2010_01;

/**
 *
 * @author chris
 */
public class Monkey {
    /**
     * Variables
     */
    int carry;
    int loss;
    int picked; // 1 is true, 0 is false
    int net;
    
    
    /**
     * Methods
     */
    
    // Constructor
    Monkey(int c, int l) {
        carry = c;
        loss = l;
        picked = 0;
        net = carry - loss;
    }
    
}
