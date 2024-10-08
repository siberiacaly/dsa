package cv4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public void countAndPrintWords(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;         
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");                
                for (String word : words) {
                    word = word.toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Chyba při čtení souboru: " + e.getMessage());
        }
        wordCount.forEach((word, count) -> System.out.println(word + " " + count + "x"));
    }
}

