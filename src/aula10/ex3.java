package aula10;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        String a = "Hello World";
        HashMap<Character, TreeSet<Integer>> mapa = new HashMap<>();
        
        for (int i=0; i<a.length(); i++) {
            TreeSet<Integer> tree = new TreeSet<>();
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(i)==a.charAt(j)){
                    tree.add(j);
                }
            }
            mapa.put(a.charAt(i), tree);
        }
        System.out.println(mapa);
    }
}
