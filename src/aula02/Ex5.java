package aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, v2, vt, d1=-1, d2=-1, t1, t2;
        while(true){
            try{
                System.out.print("Velocidade 1: ");
                v1 = sc.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        }
        do{
            try{
                System.out.print("Distância 1: ");
                d1 = sc.nextDouble();
            }catch(Exception e){
                System.out.println("Invalido");
                sc.nextLine();
            }
        }while(d1<0);
       while(true){
            try{
                System.out.print("Velocidade 2: ");
                v2 = sc.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        } 
        do{
            try{
                System.out.print("Distância 2: ");
                d2 = sc.nextDouble();
                
            }catch(Exception e){
                System.out.println("Invalido");
                sc.nextLine();
            }
        }while(d2<0);
        
        t1 = d1/v1;
        t2 = d2/v2;
        vt = (d1+d2)/(t1+t2);
        System.out.printf("A velocidade média final é: %.2f",vt);

        sc.close();
    }
}
