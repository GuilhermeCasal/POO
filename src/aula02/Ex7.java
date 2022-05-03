package aula02;
import java.lang.Math;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia;
        Coordenadas p1 = new Coordenadas();
        Coordenadas p2 = new Coordenadas();

        while(true){
            try{
                System.out.print("x1: ");
                p1.x = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        }
        while(true){
            try{
                System.out.print("y1: ");
                p1.y = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        }
       
        while(true){
            try{
                System.out.print("x2: ");
                p2.x = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        } 
        while(true){
            try{
                System.out.print("y2: ");
                p2.y = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        } 
        

        distancia = Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
        System.out.printf("A distancia é: %.2f",distancia);
        sc.close();
    }
}

class Coordenadas{
    int x;
    int y;
}
