package aula08;

enum VariedadeCarne {
    VACA,
    PORCO,
    PERU,
    FRANGO,
    OUTRA
}

public class Carne extends Alimento {
    
    private VariedadeCarne variedade;

    Carne(double proteinas, double calorias, double peso, VariedadeCarne variedade){
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }

    public void setVariedade(VariedadeCarne variedade){
        this.variedade = variedade;
    }

    public VariedadeCarne getVariedade(){
        return variedade;
    }

    public String toString() {
        return String.format("Carne %s, %s", variedade, super.toString());
    }
}
