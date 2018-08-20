/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author BenHaas
 */
public class IBeforeE {
    public static boolean check(String input) {
        return !(input.contains("cie") || (input.contains("ei") && !input.contains("cei")));
    }
    
    public static int checkFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int exceptionCount = 0;
        while(scanner.hasNext()) {
            String word = scanner.next();
            if(!IBeforeE.check(word)) {
                exceptionCount++;
                System.out.println(word);
            }
        }
        return exceptionCount;
    }
}
