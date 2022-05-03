package aula03;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double np=-1, nt=-1;

        do{    
            try{
                System.out.print("Insira a Nota Prática: ");
                np = sc.nextDouble();
            }catch(Exception e){
                System.out.println("Nota Inválida!");
                sc.nextLine();
            }
        }while(np<0 || np>20);    

        do{    
            try{
                System.out.print("Insira a Nota Teórica: ");
                nt = sc.nextDouble();
            }catch(Exception e){
                System.out.println("Nota Inválida!");
                sc.nextLine();
            }
        }while(nt<0 || nt>20);

        if(nt < 7.0 || np < 7.0){
            System.out.println("Reprovado por Nota Minima!");
        }
        
        double g = 0.4*nt+0.6*np;
        int nf = (int) g;
        System.out.print("A Nota Final do aluno é: "+nf);
        
        sc.close();

        
    }  
}
