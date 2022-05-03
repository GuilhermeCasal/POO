package aula05;
public class Rectangle {
    private double length;
    private double width;
   
    Rectangle(double length, double width){
        this.set(length, width);
    }

    public void set(double length, double width){
        if(valid(length, width)){
            this.length = length;
            this.width = width;
        }
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public static boolean valid(double length, double width){
        if(length<1 || width<1) return false;
        return true;
    }

    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimetro(){
        return this.length*2 + this.width*2;
    }

    public boolean equals(Rectangle aux){
        return this.length==aux.length && this.width==aux.width;
    }

    public String toString(){
        String nova = "Retangulo: "+this.length+" : "+this.width;
        return nova;
    }


}
