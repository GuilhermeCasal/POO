package aula04;
import java.util.Scanner;
import java.lang.String;
public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Numero de digitos: " + countDigits(frase));
        System.out.println("Numero de espaços: " + countSpaces(frase));
        System.out.println("Tem só minusculas? " + verifyLowerCase(frase));
        System.out.println("Sem double spaces: " + doubleSpaces(frase));
        System.out.println("Palindrome: " + palindrome(frase));
        sc.close();
    }
    
    public static int countDigits(String str) {
		return str.replaceAll("[^0-9]", "").length();
	}

    public static int countSpaces(String frase){
        int spaces=0;
        for(int i=0; i<frase.length(); i++){
            if(Character.isSpaceChar(frase.charAt(i))){
                spaces++;
            }
        }
        return spaces;  
    }

    public static boolean verifyLowerCase(String frase){
        for(int i=0; i<frase.length(); i++){
            if(Character.isUpperCase(frase.charAt(i))){   
                return false;
            }
        }
        return true;
    }

    public static String doubleSpaces(String frase) {
		return frase.replaceAll("[\\s]+", " ");
	}

    public static boolean palindrome(String frase){
        int i=0;
        int j=frase.length()-1;
        while(i<j){
            if(frase.charAt(i) != frase.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
