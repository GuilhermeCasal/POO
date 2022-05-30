package aula07;

public class AgenciaDeViagens {
    
    private String name;
    private String endereco;
    private Carro[] carros;
    private Alojamento[] alojamentos;

    AgenciaDeViagens(String name, String endereco){
        this.name = name;
        this.endereco = endereco;
        this.alojamentos = new Alojamento[10];
        this.carros = new Carro[10];
    }

    public String getName(){
        return this.name;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public Carro[] getCarros(){
        return this.carros;
    }

    public Alojamento[] getAlojamentos(){
        return this.alojamentos;
    }
}
