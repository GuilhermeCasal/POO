package aula10;

import java.util.*;


public class ex1 {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();

        mapa.put("branco", "cor de neve");
        mapa.put("preto", "cor de racista");
        mapa.put("amarelo", "cor de sol");
        mapa.put("verde", "cor de relva");
        mapa.put("azul", "cor de glória e porto");

        for(Map.Entry<String, String> i : mapa.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
        
        mapa.put("branco", "cor de nada");
        mapa.remove("preto");

        for(Map.Entry<String, String> i : mapa.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }    
}
