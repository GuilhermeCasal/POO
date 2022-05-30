package aula08;

public class Cereal extends AlimentoVegetariano {
    
    private String nome;

    Cereal(double proteinas, double calorias, double peso, String nome){
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    } 
    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Cereal " + nome;
    }

}
