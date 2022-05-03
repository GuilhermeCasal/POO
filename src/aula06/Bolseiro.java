package aula06;

import aula05.Date;

public class Bolseiro extends Aluno{

    private int VMB;

    Bolseiro(String nome, int iBi, Date dataNasc, int VMB){
        super(nome, iBi, dataNasc);
        setBolsa(VMB);
    }

    public void setBolsa(int VMB){
        this.VMB = VMB;
    }

    public int getBolsa(){
        return this.VMB;
    }
    
}
