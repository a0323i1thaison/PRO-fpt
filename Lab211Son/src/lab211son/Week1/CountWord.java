package lab211son.Week1;

import java.util.HashMap;
import java.util.Map;


public class CountWord {
    private String input;

    public CountWord(String input) {
        this.input = input;
    }
    public Map<String , Integer>CountW(){
         Map<String, Integer> wordCount = new HashMap<>();
        if (input == null || input.isEmpty()) {
            return wordCount; 
        }
        String[] words = input.toLowerCase().split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
    public Map<String , Integer>CountC(){
        Map<String, Integer > charCount = new HashMap<>();
        if ( input == null || input.isEmpty()){
            return charCount;
        }
        for (char c : input.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                 String key = String.valueOf(c).toLowerCase();
                charCount.put(key, charCount.getOrDefault(key, 0) + 1);
            }
        }     
        return charCount;
    }
    
    
}
