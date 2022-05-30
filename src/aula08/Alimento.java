package aula08;

public class Alimento {
    private double proteinas;
    private double peso;
    private double calorias;

    Alimento(double proteinas, double calorias, double peso){
        this.proteinas = proteinas;
        this.peso = peso;
        this.calorias = calorias;
    }

    public void setProteinas(double proteinas){
        this.proteinas = proteinas;
    }
    public double getProteinas(){
        return proteinas;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    public void setCalorias(double calorias){
        this.calorias = calorias;
    }
    public double getCalorias(){
        return calorias;
    }

    @Override
    public String toString() {
        return String.format(", Proteinas %3.1f, calorias %3.1f, Peso %.1f", proteinas, calorias, peso);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(calorias);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(peso);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(proteinas);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alimento other = (Alimento) obj;
        if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
            return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        if (Double.doubleToLongBits(proteinas) != Double.doubleToLongBits(other.proteinas))
            return false;
        return true;
    }

}
