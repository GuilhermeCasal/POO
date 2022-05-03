package aula06;

import aula05.Date;

public class Aluno extends Pessoa {

    private Date iDataInsc;
    private static int count = 100;
    private int nMec;

    Aluno(String nome, int iBi, Date dataNasc, Date iDataInsc){   
        super(nome, iBi, dataNasc);
        this.iDataInsc = iDataInsc;
        this.nMec = count++;
    }
    Aluno(String nome, int iBi, Date dataNasc){   
      super(nome, iBi, dataNasc);
        this.iDataInsc = new Date(19, 4, 2022);
        this.nMec = count++;
    }

    public Date getiDataInsc(){
        return this.iDataInsc;
    }
    public int getNMec(){
        return this.nMec;
    }
    public String toString(){
        return String.format(" "+ this.getName() + "; CC: "+ this.getcc() + "; Data Nascimento: "+ this.getDate());
    }
}
