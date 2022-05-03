package aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fr;
        double cel=0; 
        while(true){   
            try{
                System.out.print("Graus Celsius: ");
                cel=sc.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Inválido");
                sc.nextLine();
            }    
        }
        fr = 1.8 * cel + 32;
        System.out.printf("Em Fahrenheit é: %.2f", fr);
        sc.close();
    }
}
