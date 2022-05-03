package aula02;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, minutost, minutos, segundos=-1;
        do{
            try{
                System.out.print("Segundos: ");
                segundos = sc.nextInt();
            }catch(Exception e){
                System.out.println("Inválido");
                sc.nextLine();
            }
        }while(segundos<0);

        horas = segundos / 3600;
        minutost = segundos % 3600;
        minutos = minutost / 60;
        segundos = minutost % 60;

        System.out.printf("%2d::%2d::%2d", horas, minutos, segundos);
        sc.close();
    }
}
