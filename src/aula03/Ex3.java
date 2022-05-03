package aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean prime = true;
        do{
            try {
                System.out.print("Insira um número: ");
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Numero invalido");
                sc.nextLine();
            }
        }while(num<0);

        if(num == 1) {
            System.out.println("1 não é primo!");
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if(num % i == 0) {
                    prime = false;
                    break;
                } 
                else{ 
                    prime = true;
                }
            }
            if(prime) {
                System.out.printf("%d é um número primo", num);
            } else {
                System.out.printf("%d não é um número primo", num);
            }
        }
        sc.close();
    }    
}

