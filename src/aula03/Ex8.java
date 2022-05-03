package aula03;

public class Ex8 {
    public static void main(String[] args) {
        AlunoPauta[] array = new AlunoPauta[20];
        for(int i=0; i<array.length; i++){
            array[i] = new AlunoPauta();

            array[i].notaT = Math.random()*20.0;
            array[i].notaP = Math.random()*20.0;

            if(array[i].notaT<7 || array[i].notaP<7){
                array[i].notaF=66;
            }
            else{
                array[i].notaF=(int)(0.4*array[i].notaT+0.6*array[i].notaP);
            }
        }
        System.out.println("NotaT   NotaP   NotaF");
        System.out.println("_____________________");
        for(int i=0; i<20; i++){
            System.out.printf("\n%.1f   %.1f   %2d",array[i].notaT, array[i].notaP, array[i].notaF);
        }
        
    }
}
class AlunoPauta{
    double notaT;
    double notaP;
    int notaF;
}
