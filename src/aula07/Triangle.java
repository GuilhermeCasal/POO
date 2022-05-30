package aula07;



public class Triangle extends Forma{
    private double l1;
    private double l2;
    private double l3;

    Triangle(double l1, double l2, double l3){
        this.set(l1, l2, l3);
    }

    public void set(double l1, double l2, Double l3){
        if(valid(l1, l2, l3)){
            this.l1 = l1;
            this.l2 = l2;
            this.l3 = l3;
        }
    }

    public double getL1(){
        return l1;
    }
    public double getL2(){
        return l2;
    }
    public double getL3(){
        return l3;
    }

    public static boolean valid(double l1, double l2, double l3){
       if(l1 + l2 > l3 || l2 + l3 > l1 || l1 + l3 >= l2) return true;
       return false;
    }

    public double getArea(){
        double t = this.getPerimetro()/2;
		return Math.sqrt(t * (t-this.l1) * (t-this.l2) * (t-this.l3));
    }

    public double getPerimetro(){
        return this.l1+this.l2+this.l3;
    }

    public boolean equals(Triangle aux){
        return this.l1==aux.l1 && this.l2==aux.l2 && this.l3==aux.l3;
    }

    public String toString(){
        String nova = "Triangulos "+this.l1+" : "+this.l2+" : "+this.l3;
        return nova;
    }

}
