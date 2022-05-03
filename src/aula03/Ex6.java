package aula03;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int dia=0,mes, ano;
    while(true){
        try{
            System.out.print("Mês: ");
            mes=sc.nextInt();
            if(mes<0 || mes>12){
                throw new InputMismatchException();
            }
            System.out.print("Ano: ");
            ano=sc.nextInt();
            if(ano<0){
                throw new InputMismatchException();
            }
            break; 
        }catch(InputMismatchException e){
            System.out.println("Invalido");
            sc.nextLine();
        }
    }    

        switch(mes){
            case 1: 
                dia=31;
                break; 
            case 2:
                if(ano%4==0 || ano%400==0){
                    dia=29;
                }
                else{
                    dia=28;
                }
                break;
            case 3:
                dia=31;
                break;
            case 4:
                dia=30;
                break;
            case 5:
                dia=31;
                break;
            case 6:
                dia=30;
                break;
            case 7:
                dia=31;
                break;
            case 8:
                dia=31;
                break;
            case 9:
                dia=30;
                break;
            case 10:
                dia=31;
                break;
            case 11:
                dia=30;
                break;
            case 12:
                dia=31;
                break;
            default:
                System.out.print("Incorreto");
        }

        System.out.print("Este mês tem: "+dia+" dias" );
        sc.close();
    }
    
}
