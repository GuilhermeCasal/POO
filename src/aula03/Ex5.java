package aula03;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double mi=-1, tj=-1, total=0;
        do{
            try{    
                System.out.print("Motante Investido: ");
                mi=sc.nextDouble();
            }catch(Exception e){
                System.out.print("Valor Incorreto!");
                sc.nextLine();
            }    
        }while(mi<0 || mi%1000!=0);
        do{
            try{    
                System.out.print("Taxa de Juro: ");
                tj=sc.nextDouble();
            }catch(Exception e){
                System.out.println("Valor Incorreto!");
                sc.nextLine();
            }    
        }while(tj<0 || tj>5);

        for(int i=1; i<=12; i++){
            total+=mi+mi*(tj/100);
            System.out.println("Valor Mensal do Fundo do mês "+i+": "+total);
        }
        sc.close();
    }
}
