package aula11;
import java.io.*;
import java.util.*;
import java.util.Map.*;


public class Ex1{
    public static void main(String[] args) throws FileNotFoundException{

        File f = new File("major.txt");
        Scanner input = new Scanner(f);
        
        ArrayList<String> words = new ArrayList<>();    //Array para meter todas as Strings

        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<>();

        while(input.hasNext()){
            String w = input.next();

            if(w.length() > 2){
                String word = w.replaceAll("[^A-zÀ-ú0-9]", "\0");
                word = word.replaceAll("\\W{3,}", "\0");
                words.add(word);
            }
        }

        int n = 1;

        for (int i = 0; i < words.size()-1; i++) {
            if(!map.containsKey(words.get(i))){
                map.put(words.get(i), new TreeMap<>());
            }
            if(!map.get(words.get(i)).containsKey(words.get(i+1))){
                map.get(words.get(i)).put(words.get(i+1),n);
            }else{
                map.get(words.get(i)).put(words.get(i+1),n);
            }
        }

        Set<Entry<String, TreeMap<String, Integer>>> entries = map.entrySet();
        for (Entry<String, TreeMap<String, Integer>> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        input.close();
    
    }
}
