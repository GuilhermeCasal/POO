package aula07;

public class Alojamento {
    
    private String code;
    private String name;
    private String local;
    private double preco;
    private boolean disponibilidade;
    private double avaliacao;
    
    Alojamento(String code, String name, String local, double preco){
        this.code = code;
        this.name = name;
        this.local = local;
        this.preco = preco;
        this.disponibilidade = true;
        this.avaliacao = 0.0;
    }

    public String getCode(){
        return this.code;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLocal(){
        return this.local;
    }

    public double getPreco(){
        return this.preco;
    }

    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }

    public double getAvaliacao(){
        return this.avaliacao;
    }

    public void checkIn(){
        this.disponibilidade = false;
    }

    public void checkOut(double avaliacao){
        this.disponibilidade = true;
        this.avaliacao = avaliacao;
    }
}
