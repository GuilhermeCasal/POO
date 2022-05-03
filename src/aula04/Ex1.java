package aula04;
import java.util.Scanner;
import java.lang.String;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String frase = sc.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.charAt(frase.length()-1));
        System.out.println(frase.substring(0, 3));
        System.out.println(frase.toUpperCase());
        if(frase.contains("o")){
            System.out.print("A frase tem pelo menos um o ");
        }
        else{
            System.out.print("A frase não tem um o ");
        }
        sc.close();
    }

   
}
