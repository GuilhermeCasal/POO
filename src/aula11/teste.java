package aula11;
import java.io.*;
import java.util.Scanner;
public class teste {
    public static void main(String[] args){
        File directorio = new File("C:/Users/user/OneDrive/Ambiente de Trabalho/2ºAno 2ºSemestre/POO/src/aula08/");
        File[] arquivos = directorio.listFiles();
        for (File f : arquivos) {
            System.out.println(f.getAbsolutePath());
        }

        File file2 = new File( "C:/Users/user/OneDrive/Ambiente de Trabalho/2ºAno 2ºSemestre/POO/src/aula08/", "Prato.java");
        if(file2.exists()){
            System.out.println("Ficheiro existe");
        }
        File file3 = new File ("Users/user/OneDrive/Ambiente de Trabalho/2ºAno 2ºSemestre/POO/src");
        if (!file3.isDirectory()){
            System.out.println("Certo");    
        }


        Scanner input = new Scanner(new File("words.txt"));
        while (input.hasNextLine()){
            System.out.println(input.nextLine());
        }
    }
}
