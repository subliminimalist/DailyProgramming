/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author benrh
 * https://www.reddit.com/r/dailyprogrammer/comments/8s0cy1/20180618_challenge_364_easy_create_a_dice_roller/
 */
public class DiceRoller364 {
    public static void diceRoll() throws Exception {
        System.out.println("Insert dice rolls in NdM format. Type 'Done'when finished");
        Scanner importScanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while(importScanner.hasNext()) {
            String nextInput = importScanner.next();
            if(nextInput.toLowerCase().equals("done")) {
                importScanner.close();
                break;
            }
            if(!nextInput.matches("^[0-9]+d[0-9]+$")) throw new Exception("Invalid input, must be NdM where n and m are both integers");
            //System.out.println(nextInput.length());
            inputs.add(nextInput);
        }
        for(int i = 0; i < inputs.size(); i++) {
            String input = inputs.get(i);
            String[] inputArray = input.split("d");
            int numOfDice = Integer.parseInt(inputArray[0]);
            int maxRoll = Integer.parseInt(inputArray[1]);
            int totalRoll = 0;
            for(int j = 0; j < numOfDice; j++) {
                totalRoll += (int)Math.floor(Math.random() * maxRoll) + 1;
            }
            System.out.println(totalRoll);
        }        
    }

}
