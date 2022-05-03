package aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mi=-1, tjm=-1, rs;
        do{
            try{
                System.out.print("Motante investido: ");
                mi = sc.nextDouble();
                
            }catch(Exception e){
                System.out.println("Invalido");
                sc.nextLine();
            }
        }while(mi<0);
        do{
            try{
                System.out.print("Taxa de Juro Mensal: ");
                tjm = sc.nextDouble();
                
            }catch(Exception e){
                System.out.println("Invalido");
                sc.nextLine();
            }
        }while(tjm<0);

        rs = ((mi*(tjm/100))*3)+mi;
        System.out.printf("Para um investimnento de %.2f e uma taxa de juro mensal de %.2f, o motante ao fim de 3 meses será %.2f", mi, tjm, rs);
        sc.close();
    }    
}
