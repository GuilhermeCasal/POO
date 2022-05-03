package aula05;
public class Circle {
    private double raio;

    Circle(double raio){
        this.set(raio);
    }

    public void set(double raio){
        if(valid(raio)){
            this.raio = raio;
        }
    }

    public double getRaio(){
        return raio;
    }

    public static boolean valid(double raio){
        return raio>=1;
    }    

    public double getArea() {
		return Math.PI * this.raio * this.raio;
	}

    public double getPerimetro(){
        return 2*Math.PI*this.raio;
    }

    public boolean equals(Circle aux){
        return this.raio==aux.raio;
    }
    
    public String toString(){
        String nova = "Circulo: "+this.raio;
        return nova;
    }

}

