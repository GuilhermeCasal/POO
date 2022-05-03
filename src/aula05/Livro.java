package aula05;
public class Livro {
    private static int count = 100; 
    private int id;
    private String titulo;
    private String tipoEmprestimo;
    
    Livro(String titulo){
        this.id = count++;
        setTitulo(titulo);
        setTipoEmprestimo("NORMAL");
    }
    Livro(String titulo, String tipoEmprestimo){
        this.id = count++;
        setTitulo(titulo);
        setTipoEmprestimo(tipoEmprestimo);
    }

    public void setTipoEmprestimo(String tipoEmprestimo){
        assert tipoEmprestimo.equals("CONDICIONAL") || tipoEmprestimo.equals("NORMAL");
        this.tipoEmprestimo = tipoEmprestimo;
    }

	public void setTitulo(String titulo) {
		assert titulo.length()>0;
		this.titulo = titulo;
	}

    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getTipoEmprestimo(){
        return this.tipoEmprestimo;
    } 
    public String toString() {
		return String.format("Livro %d; %s; %s", this.id, this.titulo, this.tipoEmprestimo);
	}

}
