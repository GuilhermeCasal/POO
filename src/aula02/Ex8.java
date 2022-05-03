package aula02;
import java.util.Scanner;
import java.lang.Math;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int adjacente=-1, oposto=-1;
        double hipotenusa, ang;

        do{
            try{
                System.out.print("Medida do cateto oposto: ");
                oposto = sc.nextInt();
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        }while(oposto<0);
        do{
            try{
                System.out.print("Medida do cateto adjacente: ");
                adjacente = sc.nextInt();
            }catch(Exception e){
                System.out.println("Invalido!");
                sc.nextLine();
            }    
        }while(adjacente<0);
        
        hipotenusa = Math.sqrt(Math.pow(oposto,2)+Math.pow(adjacente,2));
        ang = Math.toDegrees(Math.acos(adjacente/hipotenusa));

        System.out.printf("Hipotenusa: %.2f // Angulo: %.2f graus", hipotenusa, ang);

        sc.close();
    }
}
