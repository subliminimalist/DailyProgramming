/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author benrh
 */
public class WordList {
    private static String WORD_LIST_PATH = "enable1.txt";
    File wordList;
    
    public WordList() {
        wordList = new File(WORD_LIST_PATH);
    }
    
    public HashMap<String,Object> toHashMap() throws FileNotFoundException {
        HashMap<String, Object> hm = new HashMap<>();
        Scanner scanner = new Scanner(wordList);
        while(scanner.hasNext()) {
            hm.put(scanner.next(), null);
        }
        return hm;
    }
    
    
}
