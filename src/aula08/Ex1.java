package aula08;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Viatura> viaturas = new ArrayList<>();
        viaturas.add(new Motociclo("Teu", "kawa", "1", 330, Tipo.DESPORTIVO));
        viaturas.add(new Taxi("tacsi", "mercedi", "a180ds1ss8a0", 110, 4, 350, 123));
        viaturas.add(new AutomovelLigeiro("12-AS-32", "Renault", "Megane", 90, 3, 550));
        viaturas.add(new PesadoMercadorias("gordo", "man", "bruh", 550, 2, 20000, 40000));
        viaturas.add(new PesadoPassageiros("gordin", "outromercedes", "outro", 132312, 3, 5000, 32));
        int maxKm = 0;
        
        for (Viatura viatura : viaturas) {
            viatura.trajeto(ThreadLocalRandom.current().nextInt(1, 10 + 1));
            viatura.trajeto(ThreadLocalRandom.current().nextInt(1, 10 + 1));
            for (Viatura viatura2 : viaturas) {
                System.out.printf(
                        "\nViatura 1 (%s) equals(Viatura 2): %b\n.ultimoTrajeto(): %d\t.distanciaPercorrida(): %d\n",
                        viatura,
                        viatura.equals(viatura2), viatura.ultimoTrajeto(), viatura.distanciaTotal());
            }
            if (viatura.distanciaTotal() > maxKm) {
                maxKm = viatura.distanciaTotal();
                
            }
        }
       
    }

}