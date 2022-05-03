package aula05;
public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;

    Utilizador(String nome, int nMec, String curso){
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setnMec(int nMec){
        this.nMec = nMec;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }
    public int getnMec(){
        return nMec;
    }
    public String getCurso(){
        return curso;
    }

    public String toString() {
		return String.format("Aluno: %d; %s; %s", this.nMec, this.nome, this.curso);
	}
    
}
