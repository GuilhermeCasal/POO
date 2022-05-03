package aula03;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = -1;
        do{
            try{
                System.out.print("Insira um Numero: ");
                i = sc.nextInt();
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }
        }while(i<0);
       while(i>=0){
           System.out.println(i);
           i--;
       }
       sc.close();
    }
}
