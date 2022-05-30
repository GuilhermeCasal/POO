package aula10;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Map<String, TreeSet<String>> mapa = new HashMap<>();
        TreeSet<String> tree= new TreeSet<>();

        tree.add("araras voadoras");
        tree.add("chupa misto");
        tree.add("panados com pao");
        mapa.put("primeira", tree);       
        
        TreeSet<String> fourth = new TreeSet<>();
        fourth.add("aiue");
        fourth.add("uelele");
        fourth.add("estou aqui gosto dela é donzela");
        fourth.add("vou fazer ah ah com ela");
        mapa.put("segunda", fourth);
        System.out.print(mapa); 
    }
}