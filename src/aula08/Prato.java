package aula08;
import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private List<Alimento> composicao;

    Prato(String nome){
        this.nome = nome;
        this.composicao = new ArrayList<>();
    }

    public boolean addIngrediente(Alimento novo){
        this.composicao.add(novo);
        return true;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public List<Alimento> getComposicao() {
        return composicao;
    }

    public void setComposicao(List<Alimento> composicao) {
        this.composicao = composicao;
    }
    
}
