package aula07;

public class Carro {

    private char classe;
    private String motorizacao;
    private boolean disponibilidade;

    Carro(char classe, String motorizacao){
        assert classe >= 'A' && classe <= 'F';
        assert motorizacao.equals("gasolina") || motorizacao.equals("diesel") || motorizacao.equals("hybrid") || motorizacao.equals("eletric"); 
        this.classe = classe;
        this.motorizacao = motorizacao;
        this.disponibilidade = true;
    }

    public char getClasse(){
        return this.classe;
    }

    public String getMotorizacao(){
        return this.motorizacao;
    }

    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }

    public void levantar(){
        assert disponibilidade;
        this.disponibilidade = true;
    }

    public void entregar(){
        assert !disponibilidade;
        this.disponibilidade = false;
    }  
}
