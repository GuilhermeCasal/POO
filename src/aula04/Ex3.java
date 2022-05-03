package aula04;
import java.util.Scanner;
import java.lang.String;
public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Acrónimo: " + acronimo(frase));
        sc.close();
    }

    public static String acronimo(String frase){
        String nova = "";
        if(frase.length()-1<=3){
            nova += frase.charAt(0);
            return nova.toUpperCase();
        }
        for(int i=0; i<frase.length(); i++){
           if(Character.isUpperCase(frase.charAt(i))){
               nova += frase.charAt(i);
           }
        }    
        return nova; 
    }

}
