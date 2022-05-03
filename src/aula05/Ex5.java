package aula05;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
public class Ex5 {
    public static final Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) throws IOException {
            Vector<Livro> livros = new Vector<>(100);
		    Vector<Utilizador> utilizadores = new Vector<>(100);
            while(true){
                System.out.println("Escolha uma das opções: ");
                System.out.println("-----------------------");
                System.out.println("1 - Inscrever utilizador ");
                System.out.println("2 - Remover utilizador ");
                System.out.println("3 - Imprimir lista de utilizadores ");
                System.out.println("4 - Registar um novo livro ");
                System.out.println("5 - Imprimir lista de livros ");
                System.out.println("0 - Sair");
                System.out.println("-----------------------");
                    
                System.out.println("Opção: ");
                int option = sc.nextInt();
                sc.nextLine();   
                    
                    switch(option){
                        case 1:
                            int nMec=-1;
                            do{
                                System.out.println("Insira o Numero Mecanografico: ");
                                nMec = sc.nextInt();
                                sc.nextLine();
                                for (Utilizador utilizador : utilizadores) {
                                    if(utilizador.getnMec() == nMec) {
                                        System.out.print("nMec inválido!");
                                        continue;
                                    }
                                }
                                break;
                            }while(nMec<0);
                            System.out.print("Insira o Nome: ");
                            String nome = sc.nextLine();
                            System.out.print("Insira o curso: ");
                            String curso = sc.nextLine();
                            Utilizador novissimo = new Utilizador(nome, nMec, curso);
                            utilizadores.add(novissimo);
                            break;
                        case 2:
                            System.out.println("Insira o Numero Mecanografico: ");
                            int nMec2 = sc.nextInt();
                            boolean removed = false;
                            for(int i=0; i<utilizadores.size(); i++){
                                if(utilizadores.get(i).getnMec()==nMec2){
                                    utilizadores.remove(i);
                                    System.out.println("Operação concluida com sucesso");
                                    removed=true;
                                }
                            }
                            if(!removed) System.out.println("Utilizador não encontrado");
                            break;
                        case 3:
                            for(int i=0; i<utilizadores.size(); i++){
                                System.out.println("Nome: "+utilizadores.get(i).getNome()+"  NMec: "+utilizadores.get(i).getnMec()+"  Curso: "+utilizadores.get(i).getCurso());
                            }
                            break;
                        case 4:
                            System.out.println("Titúlo do Livro: ");
                            String titulo = sc.nextLine();
                            System.out.println("Tipo de Emprestimo: NORMAL / CONDICIONAL");
                            String tipoEmprestimo = sc.nextLine();
                            
                            Livro maisquenovo = new Livro(titulo, tipoEmprestimo);
                            livros.add(maisquenovo);
                            break;
                        case 5:
                            for(int i=0; i<livros.size(); i++){
                                System.out.println("Titulo: "+livros.get(i).getTitulo()+"   Tipo de Emprestimo: "+livros.get(i).getTipoEmprestimo());
                            }
                            break;
                        case 0:
                            break;
                        default:
                            break;
                    }
                }
    }  
}
