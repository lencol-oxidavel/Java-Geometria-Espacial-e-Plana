package classes;

public class GeometriaPlana {

    //quadrado
    public double calcularAreaQuadrado(double a) {
        return Math.pow(a, 2);
    }

    public double calcularPerimetroQuadrado(double a) {
        return 4 * a;
    }
    // quadrado

    //retângulo
    public double calcularAreaRetangulo(double a, double b) {
        return a * b;
    }

    public double calcularPerimetroRetangulo(double a, double b) {
        return 2 * (a + b);
    }
    // retângulo

    //triângulo
    public double calcularAreaTriangulo(double a, double h) {
        return (a * h) / 2;
    }

    public double calcularPerimetroTriangulo(double a, double b, double c) {
        return a + b + c;
    }
    // triângulo

    //equilátero
    public double calcularAreaTrianguloEquilatero(double l) {
        return (Math.pow(l, 2) * Math.sqrt(3)) / 4;
    }

    public double calcularPerimetroTrianguloEquilatero(double l) {
        return 3 * l;
    }
    //  equilátero

    //paralelogramo
    public double calcularAreaParalelogramo(double a, double h) {
        return a * h;
    } 
   
    public double calcularPerimetroParalelogramo(double a, double b) {
        return 2 * (a + b);
    }
    // paralelogramo 

    // losango
    public double calcularAreaLosango(double D, double d) {
        return (D * d) / 2;
    }

    public double calcularPerimetroLosango(double a) {
        return 4 * a;
    }
    // losango

    //trapézio
    public double calcularAreaTrapezio(double B, double b, double h) {
        return ((B + b) * h) / 2;
    }
    
    public double calcularPerimetroTrapezio(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    // trapézio

    // círculo
    public double calcularAreaCirculo(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    
    public double calcularPerimetroCirculo(double r) {
        return 2 * Math.PI * r;
    }
    // circulo
}