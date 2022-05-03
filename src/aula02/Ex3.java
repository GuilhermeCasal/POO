package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double q, m=-1, ti, tf;
        do{
            try{
                System.out.print("Quantidade de água: ");
                m = sc.nextDouble();
                
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }
        }while(m<0);
        while(true){
            try{
                System.out.print("Temperatura inicial: ");
                ti = sc.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.print("Temperatura final: ");
                tf = sc.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }
        }
        
        
        q = m * (tf - ti) * 4184;
        System.out.printf("A energia em Joules é: %.2f" , q);
        sc.close();
    }    
}
