package aula10;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Map<String, TreeSet<String>> mapa = new HashMap<>();
        TreeSet<String> tree= new TreeSet<>();

        tree.add("araras voadoras");
        tree.add("estamos aí");
        tree.add("panados com pao");
        mapa.put("primeira", tree);       
        
        TreeSet<String> fourth = new TreeSet<>();
        fourth.add("aiue");
        fourth.add("uelele");
        fourth.add("mequiee ");
        fourth.add("voa");
        mapa.put("segunda", fourth);
        System.out.print(mapa); 
    }
}