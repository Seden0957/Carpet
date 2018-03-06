/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpet;

/**
 *
 * @author seden0957
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double length, width, cpm, totalCost; //cpm = cost per metre 
         length = 6;
         width = 8.5; 
         cpm = 19.95;
         totalCost = length*width*cpm;
         System.out.println(totalCost);
    }
    
}
