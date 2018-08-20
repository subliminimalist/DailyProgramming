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
public class DailyProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(IBeforeE.check("abeyancies"));
        try {
            System.out.println(IBeforeE.checkFile(new File("C:\\Users\\BenHaas\\Documents\\NetBeansProjects\\DailyProgramming\\enable1.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found :(");
        }
        
    }
    
}
