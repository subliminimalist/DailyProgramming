/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author benrh
 * https://www.reddit.com/r/dailyprogrammer/comments/98ufvz/20180820_challenge_366_easy_word_funnel_1/
 */
public class WordFunnel {
    public static boolean isWordFunnel(String a, String b) {
        for(int i = 0; i < a.length(); i++) {
            if(WordFunnel.removeChar(a, i).equals(b)) return true;
        }
        return false;
    }
    
    public static ArrayList<String> getFunnels(String s) throws FileNotFoundException {
        HashMap<String, Object> wordList = new WordList().toHashMap();
        ArrayList<String> funnelList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            String funnelCandidate = WordFunnel.removeChar(s, i);
            if(wordList.containsKey(funnelCandidate) && !funnelList.contains(funnelCandidate) ) funnelList.add(funnelCandidate);
        }
        return funnelList;
    }
    
    public static ArrayList<String> getFunnels(String s, HashMap<String, Object> wordList) {
        ArrayList<String> funnelList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            String funnelCandidate = WordFunnel.removeChar(s, i);
            if(wordList.containsKey(funnelCandidate) && !funnelList.contains(funnelCandidate) ) funnelList.add(funnelCandidate);
        }
        return funnelList;
    }    
    
    public static String removeChar(String s, int i)  {
        return (s.substring(0, i) + s.substring(i + 1));
    }
    
    public static int countFiveFunnels() throws FileNotFoundException {
        HashMap<String, Object> wordList = new WordList().toHashMap();  
        Set<String> words = wordList.keySet();        
        int count = 0;
        int wordsTested = 0;
        for (String word : words) {
            if(WordFunnel.getFunnels(word, wordList).size() >= 5) count ++;
            wordsTested++;
            if(wordsTested%100 == 0) System.out.println(wordsTested);
        }
        return count;
    }
}
