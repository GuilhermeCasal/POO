package aula08;

enum Tipo {
    DESPORTIVO, ESTRADA
}

public class Motociclo extends Viatura {
    private Tipo tipo;

    Motociclo(String matricula, String marca, String modelo, int potencia, Tipo tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Motociclo: " + this.tipo + " ," + super.toString();
    }
    public boolean equals(Object obj) {
        return super.equals(obj) && getClass() == obj.getClass() && this.tipo == ((Motociclo) obj).getTipo();
    }
    public int hashCode() {
        return super.hashCode() + Tipo.valueOf(this.tipo.toString()).ordinal() * 100000;
    }
}