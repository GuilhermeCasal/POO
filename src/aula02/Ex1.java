
package aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qm =-1;
        double ms =0;
        do{
            try{
                System.out.print("Quilometros: ");
                qm = sc.nextDouble();
            }catch(Exception e){
                System.out.println("Something went wrong");
                sc.nextLine();
            }
        }while(qm<0);
        ms = qm/1.609;
        System.out.printf("Milhas: %.2f",ms);
        sc.close(); 
    }
}
