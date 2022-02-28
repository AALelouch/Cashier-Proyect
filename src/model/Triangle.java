package model;

public class Triangle {
    private double oneSide = 0;
    private double twoSide = 0;
    private double threeSide = 0;

    public Triangle(double oneSide, double twoSide, double threeSide) {
        this.oneSide = oneSide;
        this.twoSide = twoSide;
        this.threeSide = threeSide;
    }

    public String analiseTheTriangle(){
        if (this.oneSide == this.twoSide && oneSide == threeSide){
            return "Equilatero";
        }else if (this.oneSide == this.twoSide || this.twoSide == this.threeSide || this.threeSide == this.oneSide){
            return "Isoseles";
        }else{
            return "Escaleneo";
        }
    }

}
