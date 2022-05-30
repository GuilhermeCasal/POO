package aula07;

public class QuartoDeHotel extends Alojamento {
    
    private String type;

    QuartoDeHotel(String code, String name, String local, double preco, String type){
        super(code, name, local, preco);
        assert type.equals("single") || type.equals("twin") || type.equals("double") || type.equals("double");
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
