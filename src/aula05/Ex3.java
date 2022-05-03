package aula05;
import java.io.IOException;
import java.util.Scanner;
public class Ex3 {
    public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
        
        Circle circles[] = new Circle[10];
        int count=0;

        for(int i=0; i<circles.length; i++){
            circles[i] = new Circle(Math.random() * 5);
        }
        for(int i=0; i<circles.length; i++){
            System.out.printf("\nCirculo: %.2f     Área: %.2f     Perimetro: %.2f\n", circles[i].getRaio(), circles[i].getArea(), circles[i].getPerimetro());
        }
        for(int i=0; i<circles.length; i++){
            if(circles[0].equals(circles[i])) count++;
        }
        System.out.println("\n-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.printf("\nQuantos circulos iguais ao primeiro? "+count);
        System.out.println("\n-------------------------------------");
        System.out.println("-------------------------------------");

        Triangle tris[] = new Triangle[10];
        int count2=0;

        for(int i=0; i<tris.length; i++){
            tris[i] = new Triangle(Math.random() * 5, Math.random() * 5, Math.random() * 5);
        }
        for(int i=0; i<tris.length; i++){
            System.out.printf("\nTriangulo: %.2f : %.2f : %.2f     Área: %.2f     Perimetro: %.2f\n", tris[i].getL1(), tris[i].getL2(), tris[i].getL3() , tris[i].getArea(), tris[i].getPerimetro());
        }
        for(int i=0; i<tris.length; i++){
            if(tris[0].equals(tris[i])) count2++;
        }
        System.out.println("\n-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.printf("\nQuantos triangulos iguais ao primeiro? "+count2);
        System.out.println("\n-------------------------------------");
        System.out.println("-------------------------------------");

        Rectangle rec[] = new Rectangle[10];
        int count3=0;

        for(int i=0; i<rec.length; i++){
            rec[i] = new Rectangle(Math.random() * 5, Math.random() * 5);
        }
        for(int i=0; i<rec.length; i++){
            System.out.printf("\nRetangulo: %.2f : %.2f     Área: %.2f     Perimetro: %.2f\n", rec[i].getLength(), rec[i].getWidth(), rec[i].getArea(), rec[i].getPerimetro());
        }
        for(int i=0; i<rec.length; i++){
            if(rec[0].equals(rec[i])) count3++;
        }
        System.out.println("\n-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.printf("\nQuantos retangulos iguais ao primeiro? "+count3);
        System.out.println("\n-------------------------------------");
        System.out.println("-------------------------------------");
        

        






        
    }
}
