/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

/**
 *
 * @author benrh
 */
public class DailyProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DiceRoller364.diceRoll();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
