package aula07;

public class Apartamento extends Alojamento{
    
    private int numQuartos; 

    Apartamento(String code, String name, String local, double preco, int numQuartos){
        super(code, name, local, preco);
        this.numQuartos = numQuartos;       
    }

    public int getNumQuartos(){
        return this.numQuartos;
    }
}
